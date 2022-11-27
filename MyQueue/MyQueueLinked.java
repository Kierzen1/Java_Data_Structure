//MyQueueLinkedList

public class MyQueueLinked implements MyQueue{
   //data containers    
   private Node head,tail;
   //utility atrribute
   private int count;
   
   public boolean isFull()       {return false;}
   public boolean isEmpty()      {return count == 0;}
   
   public boolean enqueue(Object item){
      Node node = new Node(item);
      if(isEmpty())   head = node;
      else            tail.setNext(node);
       tail = node;
        count++;
      return true;
   }
   public Object peek()          {return (!isEmpty())? head.getItem():null;}
   public Object dequeue(){
      Object item = peek();
         if(item!=null){
            Node node = head;
            head = node.getNext();
            node = null;
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
         for (Node node = head;node!=null;sb.append(node.getItem()),node=node.getNext());
         return sb.toString();
   }
}//end of class