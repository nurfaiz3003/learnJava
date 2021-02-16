public class WhileDemo {
    
    public static void main(String[] args) {

        int counter = 10;

        System.out.println("While Counter");

        while (counter > 0)
        {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Do While Counter");

        int secondcounter = 10;

        do 
        {
            System.out.println(secondcounter);
            secondcounter++;
        } while (secondcounter < 0);
        
    
    }

}
