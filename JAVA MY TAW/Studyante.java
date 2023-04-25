public abstract class Studyante extends Tao{
     String studentid, course;
      public Studyante(){//default

         super();
      }         
      public Studyante(String studentid, String lastname, String firstname, int age, String course){
         super(lastname,firstname,age);
         this.studentid=studentid;
         this.course=course;
      }
      //setters
      public void setStudentid(String studentid){this.studentid=studentid;}
      public void setCourse(String course){this.course=course;}
      //getters
      public String getStudentid(){return studentid;}
      public String getCourse(){return course;}
      
      public abstract double computeWeekly();
          
      public String toString(){
         return studentid +" "+ super.toString() + " " + course;
      }
      


}//end of class