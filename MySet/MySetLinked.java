/**
   MySetLinked
**/
public class MySetLinked implements MySet{
   //define the data containers
   private Node head, tail;
   //utility variables
   public int cardinality; //count of the elements in the set
   
   public MySetLinked(String... s){//accepts and array of String
      for(int i = 0; i <s.length;i++){
         Node node = new Node(s[i]);
         if(head==null && tail == null)  //the set is empty
            head = node;
         else        tail.setNext(node);
         tail = node;
         cardinality++;
      }
   }
   //default
   public MySetLinked(){}
   
    //sentinel methods
   public boolean isFull() {  return false;}
   public boolean isEmpty(){  return cardinality == 0;}
   //utility methods
   public boolean addItem(Object item){
      Node node = null;
      boolean ok = !isItem(item);
      if(ok){
         node = new Node(item);
         if(isEmpty())  head = node;
         else           tail.setNext(node);
         tail = node;
         cardinality++;
      }
      return ok;
   }
   public boolean isItem(Object item){
      boolean found = false;
         if(!isEmpty()){
            for(Node node = head;node != null ; node = node.getNext()){
               if(item.equals(node.getItem())){
                  found = true;
                  break;
               }
            }
         }
      return found;
   }
   //allowable operations
   public MySet union(MySet s){
      MySetLinked paramSet = (MySetLinked)s;
      String[] paramItems = new String[paramSet.cardinality];
      java.util.StringTokenizer st = new java.util.StringTokenizer(paramSet.toString(), "{},");
      int index = 0;

      for(;st.hasMoreTokens();paramItems[index++]=st.nextToken());
      MySet result = new MySetLinked();
      //populate the set Linked
      for(Node node = head; node!=null;result.addItem(node.getItem()), node = node.getNext());
      for(String str: paramItems)       result.addItem(str);
         
   
      return result;
   }
   public MySet intersect(MySet s){
      MySet paramSet = (MySetLinked)s;
      MySet result = new MySetLinked();
      
      for(Node node = head;node != null;node = node.getNext()){
         if(paramSet.isItem(node.getItem()))
            result.addItem(node.getItem());
      }
      
      return result;
   }
   public MySet subtract(MySet s){
      MySet paramSet = (MySetLinked)s;
      MySet result = new MySetLinked();
      
      for(Node node = head;node != null;node = node.getNext()){
         if(!paramSet.isItem(node.getItem()))
            result.addItem(node.getItem());
      }
      
      return result;
   }
   public MySet crossproduct(MySet s){
       MySetLinked paramSet = (MySetLinked)s;
      String[] paramItems = new String[paramSet.cardinality];
      java.util.StringTokenizer st = new java.util.StringTokenizer(paramSet.toString(), "{},");
      int index = 0;

      for(;st.hasMoreTokens();paramItems[index++]=st.nextToken());
      MySet result = new MySetLinked();
         //populate the result set;
         for(Node node = head;node!=null;node=node.getNext()){
            for(int i = 0; i < paramItems.length; i++){
               MySetLinked temp = new MySetLinked();
               temp.addItem(node.getItem());
               temp.addItem(paramItems[i]);
               if(temp.cardinality == 2)
                  result.addItem(temp);
            }
         }
      return result;
   }

   //override the toString method
   public String toString(){
      StringBuffer sb = new StringBuffer();
         sb.append("{");
            for(Node node = head; node!=null;node = node.getNext()){
               sb.append(node.getItem());
                  if(node.getNext()!=null)
                     sb.append(",");
            }
         sb.append("}");
      return sb.toString();
   }


}//end of class