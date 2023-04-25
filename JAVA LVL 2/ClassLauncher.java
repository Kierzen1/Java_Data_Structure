public class ClassLauncher{
   private static Employee[] employee;
   public static int count;
   public static void displayMenu(){
      String[] menuOptions={
              "1.    22     ",
              "2.    33     ",
              "3.   44      ",
              "4.    55     "
      };
      for(String option:menuOptions)
         System.out.println(option);
   }//end of constructor
     static public void main(String ...args){
         
         char option = '\u0000';
         while(option != '0'){
             displayMenu();
         //propt
             System.out.print("Enter numbers 1-4 onleh: ");
             option = new java.util.Scanner(System.in).nextLine().charAt(0);
         //
             switch (option){
             case '1': 
                     System.out.print("Enter number of Emplyee 1-5");
                     try{
                        int n = new java.util.Scanner(System.in).nextInt();
                        if(n > 0 && n <= 20){
                           employee = new DailyEmployee[n];
                           System.out.println("Creating "+n+" Employee");
                        }
                     }catch(Exception e){
                     System.out.print("Input Error");
                     
                     }
             case '2': 
             if (employee.length>0 && count<employee.length){
                  try{
                     System.out.print("IDNO       :"); String idno=new java.util.Scanner(System.in).nextLine();
                     System.out.print("LASTNAME   :"); String lastname=new java.util.Scanner(System.in).nextLine();
                     System.out.print("FIRSTNAME  :"); String firstname=new java.util.Scanner(System.in).nextLine();
                     System.out.print("AGE        :"); int age=new java.util.Scanner(System.in).nextInt();
                     System.out.print("POSITION   :"); String position=new java.util.Scanner(System.in).nextLine();
                     System.out.print("DAILY RATE :"); double daily_rate=new java.util.Scanner(System.in).nextDouble();
                     System.out.print("DAYS WORK  :"); double days_work=new java.util.Scanner(System.in).nextDouble();
                     employee[count++] = new DailyEmployee(idno,lastname,firstname,age,position,daily_rate,days_work);
                     System.out.println("New Employee Added...");
                  }
                  catch(Exception e){
                     System.out.println("Input Error");
                  }
                }
               break;
             case '3': System.out.println("Employee Payroll");
               System.out.println("------------------------------------------------------------");
               for(int i=0;i<count;i++){
                  System.out.println(employee[i]);
               }
               break;             case '0': 
                  System.out.print("Program Ended..");
                  System.exit(0);
         }
      }//end of while inside main
   }//end of main method
}//end of class