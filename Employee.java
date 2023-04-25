//Employee Class

public class Employee extends Student{
      private String idno, positon;
      
         public Employee(){//default constructor
            super(); 
         }
         public Employee(String idno, String name, int age, String position){
            super(name,age);//invoker parent constructor(user-defined)
            this.idno = idno;
            this.position=position;
         }
         //setters
         public void setIdno(String idno)       {this.idno = idno;}
         public void setPosition(String postion){this.position = postion;}
         //getters
         public String getIdno()                {return idno;}
         public String getPosition()            {return position;}
         //utilitymethod
         public abstract double computeSalary();//abstract makes the entire class abstract
         

}//end of class