import java.util.Scanner;

public class InputOutput {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input an integer: ");
            int myInt = input.nextInt();
            System.out.printf("You entered %d.%n%n", myInt);
        
        System.out.println("Input a double: ");
            double myDouble = input.nextDouble();
            System.out.printf("You enter %.2f.%n%n", myDouble);

        System.out.print("Input a string: ");
            input.nextLine();
            String myString = input.nextLine();
            System.out.println("You entered: " + myString);

    }

}
