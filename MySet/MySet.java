/***
   MySet Interface
**/

public interface MySet{
   public boolean isEmpty();
   public boolean isFull();
   
   public boolean isItem(Object item);
   public boolean addItem(Object item);
   
   public MySet union(MySet s);
   public MySet intersect(MySet s);
   public MySet subtract(MySet s);
   public MySet crossproduct(MySet s);
  
}