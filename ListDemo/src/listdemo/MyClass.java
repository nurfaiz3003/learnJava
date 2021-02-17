package listdemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyClass {
    public void methodOne(LinkedList<Integer> m) {
        System.out.println(m.size());
    }

    public ArrayList<Integer> methodTwo() {
        ArrayList<Integer> userAgeList = new ArrayList<>();
        userAgeList.add(50);
        return userAgeList;
    }

}
