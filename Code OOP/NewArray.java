import java.util.Scanner;

public class NewArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int Rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int Columns = input.nextInt();

        int[][] array = new int[Rows][Columns];

        System.out.println("Enter the numbers in array: ");
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = input.nextInt();
        }
        System.out.println(array);
    }
}