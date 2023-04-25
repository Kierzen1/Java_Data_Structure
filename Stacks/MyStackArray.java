/***
   MyStackArray - array implementation of the MyStack interface
**/
public class MyStackArray implements MyStack{
   //define the data container
   //encapsulate this property
   private Object[] items; //array object variable
   private int top; 
   
   //constructors
   //will be used to instantiate the data container which is the item<- Array of Object
   public MyStackArray(int size){
      this.items=new Object[size];
   }
   //default constructor
   public MyStackArray(){
      this(10); //the array of Object will be created with dafault size of ten(10) elements
   }
   //constructor that accepts a pre-created array of String
   public MyStackArray(String[] items){
      //instantiate the data container
      this(items.length);
      for(int i=0;i<items.length;push(items[i]),i++);
   }
   //inherited methods
   //sentinel methods
   public boolean isFull()       { return top==items.length;}
   public boolean isEmpty()      { return top==0; }
   //the standard method names
   public boolean push(Object item){
      boolean ok=!isFull();
      if(ok)
         items[top++]=item;
      return ok;
   }
   public Object pop(){
      Object item=peek();
         if(item!=null){
            items[--top]=null;
         }
      return item;
   }
   public Object peek(){
     /* Object item=null;
         if(!isEmpty())
            item=items[count-1];
      return item;*/
      return (!isEmpty())?items[top-1]:null;
   }
   //override(re-code the inherited method) the toString()
   public String toString(){
      //to display the content of the data container
      StringBuffer sb=new StringBuffer();
         sb.append("[");
         for(int i=top-1;i>-1;sb.append(items[i]),i--){
            if(i>0)            
               sb.append(",");
         }
         sb.append("]");
      return sb.toString();//convert the content of StringBuffer into a String
   }
   
   ///
   static public void main(String ...args){
      MyStack stack=new MyStackArray(new String[]{"a","b","c","d","e","f","g"});
         System.out.println(stack);
      
   
      /*MyStack stack=new MyStackArray();
         System.out.println(stack.push("A"));
         System.out.println(stack.push("B"));
         System.out.println(stack.push("C"));
         System.out.println(stack.push("D"));
         System.out.println(stack.push("E"));
         System.out.println(stack);
         System.out.println(stack.push("F"));
         System.out.println(stack.push("G"));
         System.out.println(stack.push("H"));
         System.out.println(stack.push("I"));
         System.out.println(stack.push("J"));
         System.out.println(stack);
         System.out.println(stack.push("K"));
         System.out.println(stack.push("L"));
         System.out.println(stack.push("M"));
         System.out.println(stack.push("N"));
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
          System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
          System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
        */
   }
   
}//end of class