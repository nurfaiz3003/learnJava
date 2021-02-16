public class ForDemo {
    
    public static void main(String[] args) {

        int[] num = {10,30,50,70,90};

        System.out.println("For Loops");

        for (int i = 0; i < num.length; i++)
        {
            System.out.println(num[i]);
        }

        System.out.println("Enhanced Loops");

        for (int item : num)
        {
            System.out.println(item);
        }
    }

}
