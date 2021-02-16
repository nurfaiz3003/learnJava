class MyClass {
    //Non static field
    public String message = "Hello World";

    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    //Static FIeld
    public static String greeting = "Hello";

    public static void displayGreeting() {
        System.out.println("Greeting: " + greeting);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        MyClass sd = new MyClass();

        System.out.println(sd.message);
        sd.displayMessage();

        System.out.println(MyClass.greeting);
        MyClass.displayGreeting();
    }
}
