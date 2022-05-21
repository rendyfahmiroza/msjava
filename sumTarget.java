import java.util.*;

class sumTarget {
  public static void main (String[] args) {
    HashSet<Integer> number = new HashSet<>();
    HashSet<Integer> tempN = new HashSet<>();
    int target = 6;
    
    number.add(1);
    number.add(2);
    number.add(3);
    number.add(8);
    number.add(6);
    
    int n = number.size();
    int first = 0;
    int last = n - 1;
    
    List<Integer> newNumber = new ArrayList<>(number);
    // System.out.println(newNumber.get(0));
    
    boolean found = false;
    while (first < last) {
      if (newNumber.get(first) + newNumber.get(last) == target) {
        found = true;
        tempN.add(newNumber.get(first));
        tempN.add(newNumber.get(last));
      }
      
      if ((newNumber.get(first) + newNumber.get(last)) < target) {
        first++;
      } else {
        last--;
      }
    }
    
    if (found) {
      System.out.println(tempN);
    } else {
      System.out.println("Tidak ditemukan");
    }
  }
}