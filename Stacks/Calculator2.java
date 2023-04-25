import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator2 implements ActionListener{
     
   JFrame frame = new JFrame();
   JPanel buttonContainer = new JPanel(new GridLayout(4,4));
   JTextField findings  = new JTextField("0.");
   JButton buttonZero = new JButton("0");
   JButton buttonOne = new JButton("1");
   JButton buttonTwo = new JButton("2");
   JButton buttonThree = new JButton("3");
   JButton buttonFour = new JButton("4");
   JButton buttonFive = new JButton("5");
   JButton buttonSix = new JButton("6");
   JButton buttonSeven = new JButton("7");
   JButton buttonEight = new JButton("8");
   JButton buttonNine = new JButton("9");
   JButton buttonMult = new JButton("*");
   JButton buttonAdd = new JButton("+");
   JButton buttonDiv = new JButton("/");
   JButton buttonMin = new JButton("-");
   JButton buttonAC = new JButton("AC");
   JButton buttonEquals = new JButton("=");
  
   String result = "";
   StringBuffer sb = new StringBuffer();
   InfixToPostfix itf;
   
   public Calculator2(){
     
      findings.setFont(new Font("Verdana", Font.BOLD, 20));
      findings.setForeground(Color.PINK);
      findings.setBackground(Color.WHITE);
      findings.setEnabled(false);
      findings.setMargin(new Insets(10, 10, 10, 10));
      findings.setHorizontalAlignment(JTextField.RIGHT);
      
      buttonZero.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonZero.setForeground(Color.PINK);
      buttonZero.setBackground(Color.BLACK);
      
      buttonOne.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonOne.setForeground(Color.PINK);
      buttonOne.setBackground(Color.BLACK);
      buttonOne.addActionListener(this);
      
      buttonTwo.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonTwo.setForeground(Color.BLACK);
      buttonTwo.setBackground(Color.PINK);
      buttonTwo.addActionListener(this);
      
      buttonThree.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonThree.setForeground(Color.PINK);
      buttonThree.setBackground(Color.BLACK);
      buttonThree.addActionListener(this);
      
      buttonFour.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonFour.setForeground(Color.BLACK);
      buttonFour.setBackground(Color.PINK);
      buttonFour.addActionListener(this);
            
      buttonFive.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonFive.setForeground(Color.PINK);
      buttonFive.setBackground(Color.BLACK);
      buttonFive.addActionListener(this);
      
      buttonSix.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonSix.setForeground(Color.BLACK);
      buttonSix.setBackground(Color.PINK);
      buttonSix.addActionListener(this);
      
      buttonSeven.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonSeven.setForeground(Color.PINK);
      buttonSeven.setBackground(Color.BLACK);
      buttonSeven.addActionListener(this);
      
      buttonEight.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonEight.setForeground(Color.BLACK);
      buttonEight.setBackground(Color.PINK);
      buttonEight.addActionListener(this);
            
      buttonNine.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonNine.setForeground(Color.PINK);
      buttonNine.setBackground(Color.BLACK);
      buttonNine.addActionListener(this);
      
      buttonAC.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonAC.setForeground(Color.BLACK);
      buttonAC.setBackground(Color.PINK);
      buttonAC.addActionListener(this);
      
      buttonEquals.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonEquals.setForeground(Color.BLACK);
      buttonEquals.setBackground(Color.PINK);
      buttonEquals.addActionListener(this);
      
      buttonMult.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonMult.setForeground(Color.BLACK);
      buttonMult.setBackground(Color.PINK);
      buttonMult.addActionListener(this);
      
      buttonAdd.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonAdd.setForeground(Color.PINK);
      buttonAdd.setBackground(Color.BLACK);
      buttonAdd.addActionListener(this);
      
      buttonDiv.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonDiv.setForeground(Color.PINK);
      buttonDiv.setBackground(Color.BLACK);
      buttonDiv.addActionListener(this);
      
      buttonMin.setFont(new Font("Verdana", Font.PLAIN, 18));
      buttonMin.setForeground(Color.BLACK);
      buttonMin.setBackground(Color.PINK);
      buttonMin.addActionListener(this);

      
      buttonContainer.add(buttonOne);   buttonContainer.add(buttonTwo);   buttonContainer.add(buttonThree);  buttonContainer.add(buttonMult);
      buttonContainer.add(buttonFour);  buttonContainer.add(buttonFive);  buttonContainer.add(buttonSix);    buttonContainer.add(buttonDiv);
      buttonContainer.add(buttonSeven); buttonContainer.add(buttonEight); buttonContainer.add(buttonNine);   buttonContainer.add(buttonMin);
      buttonContainer.add(buttonAC);    buttonContainer.add(buttonZero);  buttonContainer.add(buttonEquals); buttonContainer.add(buttonAdd);
      
      frame.add(findings, BorderLayout.NORTH);
      frame.add(buttonContainer, BorderLayout.CENTER);
      
      frame.setSize(300,300);
      frame.setLocationRelativeTo(null);
      frame.setTitle("Kierzen Ivan Jay Booc");
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setVisible(true);
      
     
   } 
   
    public void actionPerformed(ActionEvent e){
      String action = e.getActionCommand();
      sb.append(action);
      result = sb.toString();
         switch(action){
            case "AC":
               result = "0.";
               findings.setText(result);
               sb=new StringBuffer();
               break;
            case "=":
               itf = new InfixToPostfix(findings.getText().trim());
               result = itf.compute()+ "";  
               }      
      findings.setText(result);
   }

   public static void main(String ...args){
      new Calculator2();
   }

}//end of class method