package threads;

public class WhiteBoard {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        Thread thread1 = new MyThread1(calculator1);
        Thread thread2 = new MyThread2(calculator2);
        thread2.start();
        thread1.start();
    }
}

class MyThread1 extends Thread{
    Calculator calculator;
    public MyThread1(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.add(1, 2);
    }
}

class MyThread2 extends Thread{
    Calculator calculator;
    public MyThread2(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.mul(1, 2);
    }
}

class Calculator{
    public void add(int a, int b) {
        synchronized (Calculator.class){
            int num = 0;
            while (num<5) {
                try {
                    Thread.sleep(1000);
                    System.out.println("++++++++++++++++++++++++++");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                num++;
            }
        }
    }

    public void mul(int a, int b) {
        synchronized (Calculator.class){
            int num = 0;
            while (num<10) {
                try {
                    Thread.sleep(1000);
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                num++;
            }
        }
    }
}
