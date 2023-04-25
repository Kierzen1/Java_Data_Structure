public class DailyEmployee extends Employee{
      private double daily_rate, days_work;
      
      
      public DailyEmployee(){//default constructor
         super();
      }
      public DailyEmployee(String idno,String name,int age,String position,double daily_rate,double day_work){//user-defined constructor
         super(idno,name,age,position);
         this.daily_rate = daily_rate;
         this.days_work = days_work;
      }
      public void setDailyRate(double daily_rate){this.daily_rate = daily_rate;}
      public void setDaysWork(double days_work){this.days_work = days_work;}
      
      public double getDailyRate(){return daily_rate;}
      public double getDaysWork(){return days_work;}
      
      public double computeSalary(){
      return daily_rate * days_work;
      }
      
}
}

}//end of class