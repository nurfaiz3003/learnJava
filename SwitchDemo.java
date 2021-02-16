import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        System.out.println("Enter your grade: ");
        Scanner input = new Scanner(System.in);
        String userGrade = input.nextLine().toUpperCase();

        switch (userGrade)
        {
            case "A+":
            case "A":
                System.out.println("Distinction");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Sufficient");
                break;
            default:
                System.out.println("You failed.");
                break;
        }


    }
    
}
