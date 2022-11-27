public class ListLinked implements MyList{
   private Node head, tail;
   private int count;
   private Node position;
   
   public boolean isFull(){
      return false;
   }
   public boolean isEmpty(){
      return count == 0;
   }
   public boolean addItem(Object item){
      Node node = new Node(item);
      if(isEmpty()){
         head = node;
      }
      else{
         tail.setNext(node);
      }tail=node;
      count++;
      return true;
   }
   public boolean isItem(Object item){
      boolean found = false;
      if(!isEmpty()){
         Node temp = head;
         for(;temp!=null; temp = temp.getNext()){
            if(temp.getItem().equals(item)){
               position = temp;
               found = true;
               break;
            }
         }
      }return found;
   }
   public boolean deleteItem(Object item){
      boolean ok = isItem(item);
      if (ok){
         if(position == head){
            head = position.getNext();
         }
         else{
            Node temp = head;
            for(; temp.getNext()!=position; temp = temp.getNext());
            if(tail == position){
               tail = temp;
               tail.setNext(null);
            }
            else{
               temp.setNext(position.getNext());
            }
         }
         position = null;
         count --;
      }return ok;
   }
   public boolean updateItem(Object item, Object newitem){
      boolean ok = isItem(item);
      if(ok){
         position.setItem(newitem);
      }
      return ok;
   }
   public boolean insertBefore(Object item, Object newitem){
      boolean ok = isItem(item);
      if(ok){
         Node newNode = new Node(newitem);
         Node temp = head;
         for(;temp.getNext()!=position; temp = temp.getNext());
         newNode.setNext(position);
         temp.setNext(newNode);
         count++;
      }return ok;
   }
  public boolean insertAfter(Object item, Object newitem){
   boolean ok  = isItem(item);
   if(ok){
      Node newNode = new Node(newitem);
      newNode.setNext(position.getNext());
      position.setNext(newNode);
      count++;
   }return ok;
  }
  public String toString(){
   StringBuffer sb = new StringBuffer();
      for(Node temp = head; temp!=null; temp = temp.getNext()){
         sb.append(temp.getItem());
         if(temp.getNext() != null){
            sb.append(",");
         }
      } return sb.toString();
  }
}