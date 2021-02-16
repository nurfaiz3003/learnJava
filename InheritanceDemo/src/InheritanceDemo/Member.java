package InheritanceDemo;
import java.util.Scanner;

abstract public class Member {
    public String welcome = "Welcome to abc fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public Member() {
        System.out.println("Parent constructor with no parameter");
    }

    public Member(String pName, int pMemberID, int pMemberSince) {
        System.out.println("Parent constructor with 3 parameter");
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.println("Enter Admin Password: ");
        password = input.nextLine();

        if (!password.equals("abcd"))
        {
            System.out.println("Invalid password");
        }
        else
        {
            System.out.println("Please enter the discount: ");
            discount = input.nextInt();
        }
    }

    public void displayMemInfo() {
        System.out.println("Member: " + name);
        System.out.println("ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }

    abstract public void calculateAnnualFee();

}
