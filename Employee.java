class Employee { 
     
     public String name;
     public int id;
     public Employee (String name, int id) { 
          this.name = name; 
          this.id = id; 
     }
 
     public String getName ( ) { return name; } 
     public int getId ( ) { return id; }
}

class Manager extends Employee {
     public String department = "department"; 
     public Manager (String name, int id, String department) { 
          super(department, id);
          this.name = name; 
          this.id = id; 
          this.department = department;
     } 

   public String getDepartment() {return department; }
   }   