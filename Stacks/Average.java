
import java.util.Scanner;
public class Average {

    int[] grade = new int[15];

    public void userInput() {

         
         Scanner s = new Scanner(System.in);
            System.out.println("Enter grade: ");

            
            for (int i = 0; i < grade.length; i++) {
                     grade[i] = s.nextInt();
        }
    }
    void getAverage() {
            
            int sum = 0;

        for (int i = 1; i < grade.length; i++) {
                  sum += grade[i];
        }

            double average = sum / 15;

                System.out.println("\nAverage is: " + average);
    }
    void getHighest() {
        {
            int i;
            int max = grade[0];


            for (i = 1; i < grade.length; i++)
                      if (grade[i] > max)
                   
                    max = grade[i];

            System.out.print("\nHighest:" + max);
        }

    }
    void getLowest() {
        int min = grade[0];

        for (int i = 1; i < grade.length; i++) {


            if (grade[i] < min)
                min = grade[i];


        }
     
        System.out.print("\nLowest: " + min);

    }
    public void displayGrades() {
    System.out.print("Grades are: ");
        for (int grades: grade) {
            System.out.print(" " + grades);
        }
    }

    public static void main(String[] args) {
        Average newAverage = new Average();
         newAverage.userInput();
          
            newAverage.displayGrades();
            newAverage.getHighest();
            
              newAverage.getLowest();
                  newAverage.getAverage();
      

    }
}