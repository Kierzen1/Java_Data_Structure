public class SchoolLauncher{
      private static Studyante[] studyante;
      private static int count;
      public static void displayMenu(){
         String[] menuOptions ={
               "1. Create Student List",
               "2. Add Studyante     ",
               "3. Display Studyante ",
               "0. Quiters"
         };
        for(String options:menuOptions)
            System.out.println(options);
      }//end of displayMenu
      
      public static void main(String ...args){
            char options = '\u0000';
            while(options != '0' ){
            displayMenu(); 
            System.out.print("Choose from 1-3: ");
            options = new java.util.Scanner(System.in).nextLine().charAt(0);
            switch (options){
               case '1': 
                        System.out.print("Enter number of Students (1-5 onleh): ");
                        try{
                           int n = new java.util.Scanner(System.in).nextInt();
                           if(n > 0 && n <= 20)
                           studyante = new Schoolboy[n];
                           System.out.println("Creating "+n+ " Students");
                          
                        }catch(Exception e){
                           System.out.print("Input Error");
                        }
               case '2': 
                  if(studyante.length>0 && count <studyante.length)
                  try{
                     System.out.print("Student ID:"); String studentid = new java.util.Scanner(System.in).nextLine();
                     System.out.print("Last name: "); String lastname = new java.util.Scanner(System.in).nextLine();
                     System.out.print("First name: "); String firstname = new java.util.Scanner(System.in).nextLine();
                     System.out.print("Age :"); int age = new java.util.Scanner(System.in).nextInt();
                     System.out.print("Course: "); String course = new java.util.Scanner(System.in).nextLine();
                     System.out.print("Bawn: "); double bawn = new java.util.Scanner(System.in).nextDouble();
                     System.out.print("Adlaw: "); double adlaw = new java.util.Scanner(System.in).nextDouble();

                     studyante[count++] = new Schoolboy(studentid,lastname,firstname,age,course,bawn,adlaw);
                     System.out.println("Studyante Added");
                  }catch(Exception e){
                  
                  System.out.print("Input errror!!");
                  
                  }break;
               case '3':
                  System.out.println("Student Display");
                  for(int i=0;i<count;i++)
                     System.out.println(studyante[i]);
               case '0': 
               System.out.print("MANA");
               System.exit(0);               
            }
            }//end of while
      }
}//end of class