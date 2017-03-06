import java.util.*;
public class CollectionsDemo {

   public static void main(String[] args) {
      // ArrayList 
      List<String> a1 = new ArrayList<String>();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);
      
      // ArrayList iterator
      System.out.println("\n ArrayList Iterator");
      Iterator<String> ai = a1.iterator();
      System.out.print("\t");
      while (ai.hasNext()) {
    	  System.out.print("Name: " + ai.next());
    	  if (ai.hasNext()) {
    		  System.out.print(", ");
		  }
      }

      // LinkedList
      List<String> l1 = new LinkedList<String>();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);
      
      // LinkedList iterator
      System.out.println("\n LinkedList Iterator");
      Iterator<String> li = l1.iterator();
      System.out.print("\t");
      while (li.hasNext()) {
    	  System.out.print("Name: " + li.next());
    	  if (li.hasNext()) {
    		  System.out.print(", ");
		  }
      }

      // HashSet
      Set<String> s1 = new HashSet<String>(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      Map<String,String> m1 = new HashMap<String,String>(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
      
      // TreeSet
      TreeSet<String> ts = new TreeSet<String>();
      // Add elements to the tree set
      ts.add("C");
      ts.add("A");
      ts.add("B");
      ts.add("E");
      ts.add("F");
      ts.add("D");
      System.out.println();
      System.out.println(" TreeSet Elements");
      System.out.println("\t" + ts);
      // contains
      System.out.println("\t - contains(F) " + ts.contains("F"));
      System.out.println("\t - contains(H) " + ts.contains("H"));
      // first / last
      System.out.println("\t - first() " + ts.first());
      System.out.println("\t - last() " + ts.last());
      // subSet / tailSet
      System.out.println("\t - subSet(C,E) " + ts.subSet("C","E"));
      System.out.println("\t - tailSet(D) " + ts.tailSet("D"));
   }
}