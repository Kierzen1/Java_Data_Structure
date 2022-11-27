//MyQueueArray class
public class MyQueueArray implements MyQueue{
   //data containers
   private Object[] queue;
   //utility attributes
   private int head, tail;
   
   //constructor
   public MyQueueArray(int size) {this.queue = new Object[size];}
   //default
   public MyQueueArray()         {this(10);}
   //sentinel methods
   public boolean isFull()       {return tail == queue.length;}
   public boolean isEmpty()      {return tail == 0;}
   //allowable operations
   public boolean enqueue(Object item){
      boolean ok = !isFull();
         if(ok) queue[tail++] = item;
      return ok;
   }
   public Object peek()          {return (!isEmpty())? queue[head]:null;}
   public Object dequeue(){
      Object item = peek();
         if(item!=null){
            for(int i = head;i<tail;i++)
               queue[i] = queue[i+1];
               tail--;
         }
      return item;
   }
   public void clear()           { for(;!isEmpty();dequeue()); }
   public int size()             { return tail; }
   
   public String toString(){
      StringBuffer sb = new StringBuffer();
         for(int i = head; i<tail;sb.append(queue[i]),i++); 
      return sb.toString();
   }
}//end of MyQueue Class