
public interface MyQueue{
   //sentinels
   public boolean isFull();
   public boolean isEmpty();
   //Allowables
   public boolean enqueue(Object item);
   public Object peek();
   public Object dequeue();
   //Utilities
   public void clear();
   public int size();
   
}//end of interface