package InterfaceDemo;

public class InterfaceDemo {
    
    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.someMethod();
    
        System.out.println("Some Value is : " + MyInterface.myInt);

        a.someDefaultMethod();
        MyInterface.someStaticMethod();
    }
}

class MyClass implements MyInterface {
    @Override
    public void someMethod() {
        System.out.println("This is some method implemented from interface.");
    }
}

interface MyInterface{

    int myInt = 5;
    void someMethod();

    public static void someStaticMethod() {
        System.out.println("Some Static Method.");
    }

    public default void someDefaultMethod() {
        System.out.println("Some Default Method");
    }

}