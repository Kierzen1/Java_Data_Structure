public class Student{
     private String name;
     private int age;
     
     public Student(){}//default constructor
     public Student (String name, int age){//user-defined
         name = name;
         age = age;
     } 
     }//end of constructor setName
     //setters
     public setName(String name){ this.name = name; }
     public setAge(int age){ this.age = age; }
     //getters
     public  getName(){return name;}
     public getAge(){return age}
     //override
     public String toString(){
     }
     

     
}//end of class