public class HelloWorld {

    public static void main(String[] args) {
        //Print the hello world on the screen
        System.out.println("Hello World!");

        byte userAge = 20;
        long numberOfInhabitants = 21021313012678L;

        String firstName = "Nurfaiz";
        String lastName = "Herlambang";
        String fullName1 = firstName + " " + lastName + " is " + userAge + " years old.";
        String fullName2 = firstName + " " + lastName + " is " + userAge + " years old.";
        String toUpperCase = fullName1.substring(0, 7);
        System.out.println(toUpperCase);
        boolean equal = fullName1.equals(fullName2);
        System.out.println(equal);
    }
    
}
