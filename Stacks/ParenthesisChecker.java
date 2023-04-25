/***
   Kierzen Ivan Jay Booc
   DataStruct 21 -  06973
   Parenthesis Checker
   - a program that will the correct pairing of parenthesis
   <>[](){}
**/
import java.io.FileNotFoundException;

public class ParenthesisChecker {
    public static void main(String...args) throws FileNotFoundException {

        String filename = "sample.txt";
        try {
            java.util.Scanner scanner = new java.util.Scanner(new java.io.File(filename));

            while (scanner.hasNextLine()) {
                String parenthese = scanner.nextLine().trim();

                MyStack stack = new MyStackLinked();
                for (int i = 0; i < parenthese.length(); i++) {

                    char x = parenthese.charAt(i);

                    if (x == '(' || x == '[' || x == '{' || x == '<') {


                        // Push the element in the stack
                        stack.push(x);
                    } else {
                        if (i == 0 || stack.peek() == null) {
                            stack.push(x);
                            break;
                        }
                        char b = stack.peek().toString().charAt(0);
                        if ((b == '{' && x == '}') || (b == '[' && x == ']') || (b == '(' && x == ')') || (b == '<' && x == '>')) {
                            stack.pop();

                        } else {
                            break;
                        }


                    }

                } // end of for loop
                System.out.println(stack.isEmpty() ? "Balance" : "Unbalanced");

            } //end of while


        } catch (Exception e) {

            System.out.println(e);
        }//end of catch
    } //end of main method
} //end of class