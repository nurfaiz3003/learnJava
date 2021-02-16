package ObjectOrientedDemo;

public class Staff {
    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursworked;

    public void printMessage()
    {
        System.out.println("Calculating Pay...");
    }

    public int calculatePay()
    {
        printMessage();
        int staffPay;
        staffPay = hoursworked * hourlyRate;

        if (hoursworked > 0)
            return staffPay;
        else
            return -1;
    }

    public int calculatePay(int bonus, int allowance)
    {
        printMessage();
        if (hoursworked > 0)
            return hoursworked * hourlyRate + bonus + allowance;
        else
            return 0;
    }

    public void setHoursWorked(int hours)
    {
        if (hours > 0)
            hoursworked = hours;
        else
        {
            System.out.println("Error: HoursWorked Cannot be Smaller than Zero");
            System.out.println("Error: HoursWorked is not updated");
        }
    }

    public int getHoursWorked()
    {
        return hoursworked;
    }

    public Staff(String name)
    {
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------");
    }

    public Staff(String firstName, String lastName)
    {
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("---------------------------");
    }
}
