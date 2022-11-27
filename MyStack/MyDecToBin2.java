/***
   A program that would convert decimal binary
   from a file, using a MyStack ADT(Abstract data Type)
**/
public class MyDecToBin2{
   static public void main(String ...args){
      //using a MyStack ADT
      MyStack stack=new MyStackLinked(); //dynamic MyStack implementation
      //read file require try-catch, file access is a check exception
      String filename="decimal.txt";
      try{
         java.util.Scanner scanner=new java.util.Scanner(new java.io.File(filename));
         while(scanner.hasNextLine()){
            String decimal=scanner.nextLine().trim(); //remove additional spaces enclosing in the text
            //using the wrapper class, convert the read text
            int numeric=Integer.parseInt(decimal);
            //do the conversion process
            for(;numeric>0;numeric/=2){
               int bin = numeric % 2;
               stack.push(bin);
            }
            System.out.println(stack);
            stack=new MyStackLinked(); //re-initialize the stack instance
         }
      }catch(Exception e){
         e.printStackTrace();
      }
   }//end of main method
}//end of class