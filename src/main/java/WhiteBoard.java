import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhiteBoard {
    public static void main(String[] args) {
        Parent child =  new Child();
        Child downcastedChild = (Child) child;
        downcastedChild.childMethod();
    }




    public static void printComplements(Integer[] numbers, int target) {
        List<Integer> list = Arrays.asList(numbers);
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : list) {
            int complement = target - number;
            if (!map.containsKey(complement) && list.contains(complement))
                map.put(number, complement);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }

    public static int getNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return arr[i];
            }
        }
        return -1;
    }
}

class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child method");
    }
}

