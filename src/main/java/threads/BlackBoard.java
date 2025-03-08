package threads;

import java.util.ArrayList;
import java.util.List;

public class BlackBoard {
    public static void main(String[] args) {
        Holder holder = new Holder();
        HolderBase holderBase = new HolderBase(holder);
        HolderUtil holderUtil = new HolderUtil(holder);
        Thread1 thread1 = new Thread1(holderBase);
        Thread2 thread2 = new Thread2(holderUtil);
        thread2.start();
        thread1.start();
    }
}

class Thread1 extends Thread{

    private final HolderBase holderBase;
    Thread1(HolderBase holderBase){
        this.holderBase = holderBase;
    }

    @Override
    public void run() {
        holderBase.getSize();
    }
}

class Thread2 extends Thread{

    private final HolderUtil holderUtil;
    Thread2(HolderUtil holderUtil){
        this.holderUtil = holderUtil;
    }

    @Override
    public void run() {
        holderUtil.addValues();
    }
}

class HolderBase{
    private Holder holder;
    HolderBase(Holder holder){
        this.holder = holder;
    }

    public void getSize(){
        int i = 0;
        while(i<5) {
            holder.size();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}


class HolderUtil{
    private final Holder holder;
    HolderUtil(Holder holder){
        this.holder = holder;
    }

    public void addValues(){
        synchronized (holder){
            int i = 0;
            while(i<10){
                holder.add(String.valueOf(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
            }
        }
    }
}

class Holder{
    private final List<String> list = new ArrayList<>();

    public synchronized void add(String str){
        list.add(str);
        System.out.println("Added: "+str);
    }

    public synchronized void size(){
        System.out.println("Size of the list :" + list.size());
    }

}
