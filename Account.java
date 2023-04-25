import javax.swing.JOptionPane;

public class Account{
      String accountOwnerName;
     double balance = 100.0;
      
      public void setAccountOwnerName (String accountOwnerName){
            this.accountOwnerName = accountOwnerName;
      }
       public void setBalance (double balance){
            this.balance = balance;
      }
      public String getAccountOwnerName(){
            return accountOwnerName;
      }
     
       public double getBalance(){
            return balance;
      }
      
      public void withdraw(double withdrawNumber, String name){ 
           if(withdrawNumber > balance){
                 JOptionPane.showMessageDialog(null, "The amount of money withdrawn has exceeded!");   
      }
       else{
        
        double num1;
        balance = balance - num1;
        
       JOptionPane.showMessageDialog(null, "Withdraw: " + num1   + "\nRemaining balance: " + balance);     
      }
      
      public void deposit(double depositNumber, String accountOwnerName){
          balance = balance + depositNumber;
          JOptionPane.showMessageDialog(null, "Deposited: " + num2   + "\nCurrent balance: " + balance);   

      }

   
  
}