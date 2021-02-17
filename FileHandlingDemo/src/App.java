import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        // For Writing File
        String text = "Hello World";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("myFile2.txt", true)))
        {
            writer.write(text);
            writer.newLine();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        File f = new File("myFile.txt");
        File nf = new File("myNewFile.txt");

        f.renameTo(nf);
        nf.delete();

        // For Reading File
        /*
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader("myFile.txt")))
        {
            line = reader.readLine();

            while (line != null)
            {
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        */
    }
}
