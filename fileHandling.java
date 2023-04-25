import java.io.File;
import java.util.Scanner;

public class fileHandling{

    static String filename="sample.txt";
     public static void main(String ...args) {
        
        try (Scanner scan = new Scanner(new File(filename)))
        {

            System.out.println(scan.nextLine());
        }
        catch (Exception exception){
            System.out.println("Error handling file...");
        }
    }
}

