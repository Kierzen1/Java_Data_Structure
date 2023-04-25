public class Schoolboy extends Studyante{
        double bawn;
        double adlaw;
        public Schoolboy(){//default
            super();
        }
        public Schoolboy(String studentid, String lastname, String firstname, int age, String course, double bawn, double adlaw){
            super(studentid, lastname, firstname, age ,course);
            
            this.bawn = bawn;
            this.adlaw = adlaw;

        }
        
        public void setBawn(double bawn)  {this.bawn = bawn;}
        public void setAdlaw(double adlaw){this.adlaw = adlaw;}
        
        public double getBawn(){return bawn;}
        public double getAdlaw(){return adlaw;}
        
        public double computeWeekly(){
            return bawn * adlaw;
        }
        public String toString(){
            return super.toString() +" " + bawn +" "+ adlaw +" " + computeWeekly();
        }
}//end of class