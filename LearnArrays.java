import java.util.Arrays;

public class LearnArrays {

    public static void main(String[] args) {

        String nameList = "Andy, Dwyer";
        String[] listName = nameList.split(", ");
        System.out.println(Arrays.toString(listName));

        int[] userAges = {2,3,4,5,6};
        int[] userAges2 = new int[5];
        userAges2[0] = 54;
        System.out.println(userAges2[0]);

        int[] arr1 = {0,2,4,6,8,10};
        int[] arr2 = {0,2,4,6,8,10};
        int[] arr3 = {10,8,6,4,2,0};
        boolean result1 = Arrays.equals(arr1, arr3);
        Arrays.sort(arr3);
        int foundIndex = Arrays.binarySearch(arr1, 4);

        System.out.println(Arrays.toString(arr3));
        System.out.println(result1);
        System.out.println(foundIndex);
        System.out.println(arr3.length);
        System.out.printf("\"%d / %d\" is %.3f", 5, 2, 2.5);
    }
    
}
