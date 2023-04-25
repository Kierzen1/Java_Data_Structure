public class Tao{
      String lastname, firstname;
      int age;
      
      public Tao(){}// default constructor
      
      public Tao(String lastname, String firstname, int age){
         this.lastname = lastname;
         this.firstname = firstname;
         this.age = age;    
      }
      //setters
      public void setLastname (String lastname)    {this.lastname=lastname;}
      public void setFastname (String lastname)    {this.lastname=lastname;}
      public void setAge (int age)                 {this.age=age;}
      //getters
      public String getLastname()  {return lastname;}
      public String getFirstname()  {return firstname;}
      public int getAge()  {return age;}
      //to string method
      public String toString(){
         return lastname +" "+firstname+" "+ age;
      }


}//end of class