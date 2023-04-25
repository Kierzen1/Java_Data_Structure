public class Parenthesis2Checker{
   static public void main(String ...args){
   MyStack stack;
   String filename= "sample.txt";
   try{
       java.util.Scanner scanner=new java.util.Scanner(new java.io.File(filename));
       while (scanner.hasNextLine()) {
         stack = new MyStackLinked();
         String s = scanner.nextLine();
         
         for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
               case '(':
               case '{':
               case '<':
               case '[':
                  stack.push(c);
                  break;
               case ')':
                  if(!stack.isEmpty()) {
                     boolean ok = false;
                     MyStackLinked tempStack = new MyStackLinked();
                     while(!stack.isEmpty()) {
                        char tempChar = stack.pop().toString().charAt(0);
                        if(tempChar == '(') {
                           ok = true;
                           break;
                        }
                        else {
                           tempStack.push(tempChar);
                           break;
                        }
                     }
                     
                     while(!tempStack.isEmpty()) {
                        stack.push(tempStack.pop());
                     }
                     
                     if(!ok)
                        stack.push(c);
                     
                  } else {
                     stack.push(c);
                  }
                  break;
               case '}':
                  if(!stack.isEmpty()) {
                     boolean ok = false;
                     MyStackLinked tempStack = new MyStackLinked();
                     while(!stack.isEmpty()) {
                        char tempChar = stack.pop().toString().charAt(0);
                        if(tempChar == '{') {
                           ok = true;
                           break;
                        }
                        else {
                           tempStack.push(tempChar);
                           break;
                        }
                     }
                     
                     while(!tempStack.isEmpty()) {
                        stack.push(tempStack.pop());
                     }
                     
                     if(!ok)
                        stack.push(c);
                     
                  } else {
                     stack.push(c);
                  }
                  break;
               case '>':
                  if(!stack.isEmpty()) {
                     boolean ok = false;
                     MyStackLinked tempStack = new MyStackLinked();
                     while(!stack.isEmpty()) {
                        char tempChar = stack.pop().toString().charAt(0);
                        if(tempChar == '<') {
                           ok = true;
                           break;
                        }
                        else {
                           tempStack.push(tempChar);
                           break;
                        }
                     }
                     
                     while(!tempStack.isEmpty()) {
                        stack.push(tempStack.pop());
                     }
                     
                     if(!ok)
                        stack.push(c);
                     
                  } else {
                     stack.push(c);
                  }
                  break;
               case ']':
                  if(!stack.isEmpty()) {
                     boolean ok = false;
                     MyStackLinked tempStack = new MyStackLinked();
                     while(!stack.isEmpty()) {
                        char tempChar = stack.pop().toString().charAt(0);
                        if(tempChar == '[') {
                           ok = true;
                           break;
                        }
                        else {
                           tempStack.push(tempChar);
                           break;
                        }
                     }
                     
                     while(!tempStack.isEmpty()) {
                        stack.push(tempStack.pop());
                     }
                     
                     if(!ok)
                        stack.push(c);
                     
                  } else {
                     stack.push(c);
                  }
                  break;
            }
         }
         
         if(stack.isEmpty()) {
            System.out.println("Balanced.");
         } else {
            System.out.println("Unbalanced");
         }
      }
    } catch(Exception e){
      System.out.print("Invalid Input");
    }
   }
}