import java.util.Scanner;

public class IfDemo {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age < 0 || age > 100) 
        {
            System.out.println("Invalid Age.");
        }
        else if (age < 18)
        {
            System.out.println("Your are underage to enter.");
        }
        else if (age < 21)
        {
            System.out.println("You need parental consent.");
        }
        else
        {
            System.out.println("You are eligible to enter the festival.");
        }

        int price = age > 21 ? 10000 : 11000;

        System.out.println("The Price is: " + price);
    }

}
