package listdemo;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> userAgeList = new LinkedList<>();

        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        userAgeList.add(2, 51);

        System.out.println(userAgeList.size());
        userAgeList.remove(3);
        System.out.println(userAgeList.contains(12));
        System.out.println(userAgeList.indexOf(12));
        System.out.println(userAgeList.get(2));

        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);
        System.out.println(userAgeArray[0]);
        System.out.println(userAgeList);
        System.out.println(userAgeList.peek());
        System.out.println(userAgeList);
        System.out.println(userAgeList.poll());
        System.out.println(userAgeList);
        System.out.println(userAgeList.pollLast());
        System.out.println(userAgeList);

        MyClass mc = new MyClass();

        mc.methodOne(userAgeList);

        ArrayList<Integer> response = mc.methodTwo();

        System.out.println(response);
    }
}
