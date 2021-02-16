import java.util.Scanner;

public class ExceptionHandling {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try
        {
            System.out.print("Input num: ");
                int num = input.nextInt();
            System.out.print("Input Denum: ");
                int denum = input.nextInt();
            System.out.println("The Result is " + (num/denum));
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Done.");
        }

    }

}
