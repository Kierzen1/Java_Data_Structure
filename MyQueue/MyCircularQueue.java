public class MyCircularQueue implements MyQueue{
   //data containers
    private Object[] queue;
   //utility attributes
   private int head, tail,count;
   
   public MyCircularQueue(int size)       {this.queue = new Object[size];}
   public MyCircularQueue()               {this(10);}
   //sentinel method
   public boolean isFull()                {return count == queue.length;}
   public boolean isEmpty()               {return count == 0;}
   
   public boolean enqueue(Object item){
      boolean ok =!isFull(); 
         if(ok){
            queue[tail++] = item;
            tail%=queue.length;
            count++;
         }
      return ok;  
   }
   public Object peek()                   {return (!isEmpty())?queue[head]:null;}
   public Object dequeue(){
      Object item = peek();
         if(item != null){
            queue[head++] = null;
            head%=queue.length;
            count--;
         }
      return item;
   }
   public void clear(){
      for(;!isEmpty();dequeue());
   }
   public int size(){
      return count;
   } 
   public String toString(){
      StringBuffer sb = new StringBuffer();
         for(int i = 0;i<queue.length;i++){
            if(queue[i]!=null)   sb.append(queue[i]);
            else                 sb.append ("_");
               if(i<queue.length-1) 
                   sb.append(",");
         }
      return sb.toString();
   }
}//end of class