public class MySetArray implements MySet{
   private Object[] items;
   public int cardinality;
   
   public MySetArray(String... s){
      items = new Object[s.length];
      //int i = 0;
      for(String st:s)
         items[cardinality++]=st;
   }
   public MySetArray(int size){items = new Object[size];};
   
   public MySetArray(){this(10);};
   
   public String toString(){
      StringBuffer sb = new StringBuffer();
         sb.append("{");
         for(int i = 0; i < cardinality;i++){
            sb.append(items[i]);
            
            if(i<cardinality-1)
               sb.append(",");
         }
         sb.append("}");
      return sb.toString();
   }
   public boolean isEmpty(){return cardinality == 0;};
   public boolean isFull(){return cardinality == items.length;};
   
   public boolean isItem(Object item){
      boolean found = false;
      if(!isEmpty()){
        for(int i = 0;i<cardinality;i++){
            if(items[i].equals(item)){
               found=true;
               break;
            }
        }
      }
      return found;
   }
   public boolean addItem(Object item){
      boolean ok =!isItem(item) && !isFull();
         if(ok) items[cardinality++]=item;
      return ok;
   }
   
   public MySet union(MySet s){
      MySetArray paramSet = (MySetArray)s;
      String[] paramItems = new String[paramSet.cardinality];
      java.util.StringTokenizer st=new java.util.StringTokenizer(paramSet.toString(),"{},");
      int index=0;
      while(st.hasMoreTokens())
         paramItems[index++]=st.nextToken();
      
      int size = cardinality + paramSet.cardinality;
      MySet result= new MySetArray(size);
         
         for(int i = 0;i<cardinality; result.addItem(items[i]),i++);
         for(int i = 0;i<paramSet.cardinality;result.addItem(paramItems[i]),i++);
         
      
      return result;
   }
   public MySet intersect(MySet s){
      MySetArray paramSet = (MySetArray)s;
      int size=(cardinality<paramSet.cardinality)?cardinality:paramSet.cardinality;
      MySet result= new MySetArray(size);
         for(int i = 0;i<cardinality;i++){
            if(paramSet.isItem(items[i])){
               result.addItem(items[i]);
            }
         }
      return result;

   }
   public MySet subtract(MySet s){MySetArray paramSet = (MySetArray)s;
      int size=(cardinality<paramSet.cardinality)?cardinality:paramSet.cardinality;
      MySet result= new MySetArray(size);
         for(int i = 0;i<cardinality;i++){
            if(!paramSet.isItem(items[i])){
               result.addItem(items[i]);
            }
         }
      return result;

}
   public MySet crossproduct(MySet s){
      MySetArray paramSet = (MySetArray)s;
      String[] paramItems = new String[paramSet.cardinality];
      java.util.StringTokenizer st=new java.util.StringTokenizer(paramSet.toString(),"{},");
      int index=0;
      while(st.hasMoreTokens())
         paramItems[index++]=st.nextToken();
      
      int size = cardinality * paramSet.cardinality;
      MySet result= new MySetArray(size);
      //populate
      for(int i=0;i<cardinality;i++){
         for(int j=0;j<paramSet.cardinality;j++){
            MySetArray temp=new MySetArray(2);
               temp.addItem(items[i]);
               temp.addItem(paramItems[j]);
               if(temp.cardinality==2)
                  result.addItem(temp);
         }
      }
      
      return result;  
   }

}