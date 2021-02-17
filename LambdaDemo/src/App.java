public class App {
    public static void main(String[] args) throws Exception {
        
        MyNumber num1;
        num1 = () -> 12.3;
        System.out.println("The Number Is: " + num1.getValue());

        num1 = () -> 2.3;
        System.out.println("The Number Is: " + num1.getValue());

        num1 = () -> {
            int counter = 1;
            int sum = 0;
            while (counter<5)
            {
                sum = sum + counter;
                counter++;
            }

            return sum;
        };
        System.out.println("The Number Is: " + num1.getValue());
        
        MyNumberPara num2;
        num2 = (n, m) -> n + m;
        System.out.println("The Number Is: " + num2.getValue2(2, 3));

        num2 = (n, m) -> {
            if (n > 10)
            {
                return m;
            }
            else
            {
                return m+1;
            }
        };
        System.out.println("The Number Is: " + num2.getValue2(2, 3));
    }
}

@FunctionalInterface
interface MyNumber {
    double getValue();
}

@FunctionalInterface
interface MyNumberPara {
    double getValue2(int n, int m);
}