import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {

        int[] num = {10,11,13,14,15,16,35};

        Scanner input = new Scanner(System.in);

        try
        {
            System.out.println("Input the index: ");
            int index = input.nextInt();
            if (index == 0) // Force to throw exception when index is 0
                throw new ArrayIndexOutOfBoundsException();
                
            System.out.printf("Index %d = %d%n", index, num[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Index is Invalid");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: Invalid Input.");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
