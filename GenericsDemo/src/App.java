public class App {
    public static void main(String[] args) throws Exception {
        MyGenericClass<Double> a = new MyGenericClass<>();
        a.setMyVar(10.1);
        a.printValue();
    }
}


class MyGenericClass<T extends Number> {
    private T myVar;
    
    void setMyVar(T i) {
        myVar = i;
    }

    void printValue() {
        System.out.println("The value of myVar is " + myVar);
    }
}
