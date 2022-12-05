/** 
   Binary Tree
**/

public class MyBinTree {
    //tree attributes
    private Object item;
    private MyBinTree left, right, parent;
  
    //constructor
    public MyBinTree(Object item) {
        this.item = item;
    }
    
    public MyBinTree() {}
    
    //setter
    public void setItem(Object item) {
        this.item = item;
    }
    public void setLeft(MyBinTree left) {
        this.left = left;
    }
    public void setRight(MyBinTree right) {
        this.right = right;
    }
    public void setParent(MyBinTree parent) {
        this.parent = parent;
    }
    
    //getter
    public Object getItem() {
        return item;
    }
    public MyBinTree getLeft() {
        return left;
    }
    public MyBinTree getRight() {
        return right;
    }
    public MyBinTree getParent() {
        return parent;
    }
    
    //utility method
    public MyBinTree addItem(Object item, MyBinTree root) {
        MyBinTree newtree = new MyBinTree(item);
        if (root == null) root = newtree;
        else {
            Comparable c = (Comparable)root.getItem();
            if (c.compareTo(item) > 0) {
                root.setLeft(addItem(item,root.getLeft()));
            } else {
                if (c.compareTo(item) < 0) {
                    root.setRight(addItem(item, root.getRight()));
                }
            }
        }
        return root;   
    }//end of AddItem
    public void preOrder(MyBinTree root){
      if(root != null){
         System.out.print(root.getItem().toString());
         preOrder(root.getLeft());
         preOrder(root.getRight());
      }
    }//end of preOrder
   public void inOrder(MyBinTree root){
      if(root != null){
         inOrder(root.getLeft());
         System.out.print(root.getItem().toString());
         inOrder(root.getRight());
      }
    }//end of inOrder
    public void postOrder(MyBinTree root){
      if(root != null){
         postOrder(root.getLeft());
         postOrder(root.getRight());
         System.out.print(root.getItem().toString());
      }
    }//end of postorder

    public void levelOrder(MyBinTree root){
      java.util.Queue<MyBinTree> q = new java.util.LinkedList<MyBinTree>();
         q.add(root);
         while(!q.isEmpty()){
            MyBinTree tmp = q.poll();
            System.out.print(tmp.getItem());
            if(tmp.getLeft()!=null){
               q.add(tmp.getLeft());
            }
            if(tmp.getRight()!=null){
               q.add(tmp.getRight());
            }

         }      
    
    }//end of levelOrder
    
    public static void main(String... args){
      String dta = "ACKNOWLEDGE";
      MyBinTree root = null;
      for(int i = 0;i<dta.length();i++){
         root = new MyBinTree().addItem(dta.charAt(i),root);
      }
      System.out.print("Level-order: "); new MyBinTree().levelOrder(root);
      System.out.print("\nPre: "); new MyBinTree().preOrder(root);
      System.out.print("\nIn: "); new MyBinTree().inOrder(root);
      System.out.print("\nPost: "); new MyBinTree().postOrder(root);
      /*
      System.out.print("Pre-order: "); new MyBinTree().preOrder(root);
      System.out.print("\nIn-order: "); new MyBinTree().inOrder(root);
      System.out.print("\nPost-order: "); new MyBinTree().postOrder(root);
      System.out.print("\nLevel-order: "); new MyBinTree().leveloOrder(root);*/



      
    }

} //end of class