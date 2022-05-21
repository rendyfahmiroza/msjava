import java.util.*;

class arrayMerger {
  public static void main (String[] args) {
    HashSet<String> arrayA = new HashSet<>();
    HashSet<String> arrayB = new HashSet<>();
    
    arrayA.add("kazuya");
    arrayA.add("jin");
    arrayA.add("lee");
    arrayB.add("kazuya");
    arrayB.add("feng");
    
    arrayA.addAll(arrayB);
    System.out.println(arrayA);
  }
}