public class MySetTest{
   public static void main(String... args){
      MySet setA = new MySetArray(new String[]{"a", "b", "c", "d", "e"});
      MySet setB = new MySetArray(new String[]{"d", "e", "f", "g"});
      System.out.println("Set A: " + setA);
      System.out.println("Set A: " + setB);
      System.out.println("Set AUB " + setA.union(setB));
      System.out.println("Set A^B " + setA.intersect(setB));
      System.out.println("Set A-B " + setA.subtract(setB));
      System.out.println("Set B-A " + setB.subtract(setA));
      System.out.println("Set A*B " + setA.crossproduct(setB));


   }
}