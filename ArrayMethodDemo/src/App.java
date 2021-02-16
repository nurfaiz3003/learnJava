import java.util.Arrays;

class MyClass {

    public void printFirstElement(int[] a) {
        System.out.println("The first element is " + a[0]);
    }

    public int[] returnArray() {
        int[] a = new int[3];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = i*2;
        }
        return a;
    }

    public void passPrimitive(int primitivePara) {
        primitivePara = 10;
        System.out.println("Value Inside Method: " + primitivePara);
    }

    public void passReference(int[] refPara) {
        refPara[1] = 5;
        System.out.println("Value Inside Mehod: " + refPara[1]);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MyClass amd = new MyClass();
        int[] myArray = {1,2,3,4,5};
        amd.printFirstElement(myArray);

        int[] myArray2 = amd.returnArray();
        System.out.println(Arrays.toString(myArray2));

        int number = 2;
        System.out.println("Before: " + number);
        amd.passPrimitive(number);
        System.out.println("After: " + number);

        System.out.println("\n");

        System.out.println("Before: " + myArray[1]);
        amd.passReference(myArray);
        System.out.println("After: " + myArray[1]);

    }
}
