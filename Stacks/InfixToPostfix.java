/***
   infix to postfix converter
**/
public class InfixToPostfix{
   //define object variable
   private String infix;
   //constructor
   public InfixToPostfix(String infix)    { this.infix = infix; }
   //
   private boolean isOperator(char ch)    { return ch=='-' || ch=='+' || ch=='/' || ch=='*'; }
   private boolean isSpace(char ch)       {return ch == ' ';}
   private boolean isLowerPrecedence(char a,char b){
      switch(a){
         case '+':case '-': return !((b=='+') || (b=='-'));
       }
       return false;
   }
   public String convert(){
      StringBuffer postfix=new StringBuffer();
         MyStack stack = new MyStackLinked();
         if(!infix.equals("")){
            //i will use built-in Stack from the util package
           
            java.util.StringTokenizer st = new java.util.StringTokenizer(infix,"-+*/",true);
            while(st.hasMoreTokens()){
               String token = st.nextToken(); //iterator operator
               char ch = token.charAt(0);
               if(isOperator(ch)){
                  while(!stack.isEmpty() && !isLowerPrecedence(stack.peek().toString().charAt(0),ch)){
                     postfix.append(stack.pop()).append(" ");
                  }
                  stack.push(ch);
               }
               else postfix.append(token).append(" ");
            }    
            while(!stack.isEmpty()){
               postfix.append(stack.pop()).append(" ");
            }
         }
      return postfix.toString();
   }
   //
   public double compute(){
      double result = 0.0;
         MyStack stack = new MyStackLinked();
         String postfix = convert();
            java.util.StringTokenizer st = new java.util.StringTokenizer(postfix, "-+*/",true);
            while(st.hasMoreTokens()){
               String token = st.nextToken();
               char ch = token.charAt(0);
               if(!isOperator(ch)){
                  if(!isSpace(ch))
                     stack.push(token);
               }
               else{
                  if(!stack.isEmpty()){
                     double a = Double.parseDouble(stack.pop().toString());
                     double b = Double.parseDouble(stack.pop().toString());
                     switch(ch){
                        case '*':result = a*b; break;
                        case '/':result = a/b; break;
                        case '+':result = a+b; break;
                        case '-':result = a-b; 
                     }
                  }
                  stack.push(result);
               }
            }
      return Double.parseDouble(stack.pop().toString());
   }
   //
   static public void main(String ...args){
      String infix = "10.1-2.3*3.75+4.01/55.5";
      InfixToPostfix itf = new InfixToPostfix(infix);
      String postfix = itf.convert();
      System.out.print(infix + "-->");
      System.out.println(postfix);
      System.out.println(itf.compute());
   }
}//end of class