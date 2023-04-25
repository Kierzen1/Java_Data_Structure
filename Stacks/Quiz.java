import java.util.Scanner;

public class Quiz{
	static double[] grades = new double[15];
	
	public static void main(String ...args) {
			for(int i = 0; i < grades.length; i++) {
				System.out.print("Please Enter Grade: ");
				grades[i] = new Scanner(System.in).nextDouble();
			}
		
		String r = "yes";
		while(r.equals("yes") || r.equals("y")) {
			System.out.println("1 = Display Average, 2 = Get Highest, 3 = Get Lowest, 4 = Display Grades");
			String i = new Scanner(System.in).nextLine();
			
			switch(i) {
				case "1":
					System.out.printf("Average: %.1f \n",getAverage());
					System.out.println("Would you like to continue?(yes|y)");
					r = new Scanner(System.in).nextLine();
					break;
				case "2":
					System.out.println("Highest: " + getHighest());
					System.out.println("Would you like to continue?(yes|y)");
					r = new Scanner(System.in).nextLine();
					break;
				case "3":
					System.out.println("Lowest: " + getLowest());
					System.out.println("Would you like to continue?(yes|y)");
					r = new Scanner(System.in).nextLine();
					break;
				case "4":
					System.out.println(displayGrades());
					System.out.println("Would you like to continue?(yes|y)");
					r = new Scanner(System.in).nextLine();
					break;
				default:
					System.out.println("Please Enter a Valid Choice");
					break;
			
			}
			
		}
		
	}
	
	public static double getAverage() {
		double sum = 0;
		
		for(double grade: grades)
			sum += grade;
		
		return sum/grades.length;
		
	}
	
	public static double getHighest() {
		
		double max = grades[0];
		
		for(int i = 1; i < grades.length;i++) {
			if(max < grades[i]) {
				max = grades[i];
			}
			
		}
			
		return max;
		
	}
	
	public static double getLowest() {
		double min = grades[0];
		
		for(int i = 1; i < grades.length;i++) {
			if(min > grades[i]) {
				min = grades[i];
			}
			
		}
		
		return min;
	}
	
	public static String displayGrades() {
		String msg = "";
		
		for(int i = 0; i < grades.length; i++) {
			msg += grades[i];
			
			if(i < grades.length - 1)
				msg += ", ";
			
		}
		
		return msg;
	}

}