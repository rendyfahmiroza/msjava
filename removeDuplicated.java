import java.util.*;

class removeDuplicated {
  public static void main (String[] args) {
    List<Integer> number = new ArrayList<>();
    List<Integer> newNumber = new ArrayList<>();
    number.add(2);
    number.add(11);
    number.add(2);
    number.add(2);
    
    // Array sort
    Queue<Integer> sortNumber = new PriorityQueue<>(number);
    number.clear();
    number.addAll(sortNumber);
    System.out.println(number);
    int n = number.size();
    int first = 0;
    
    List <Integer> index = new ArrayList<>();
    while (first < n - 1) {
      if (number.get(first) != number.get(first + 1)) {
        newNumber.add(number.get(first));
      }
      first++;
    }
    
    newNumber.add(number.get(n - 1));
    System.out.println(newNumber);
    System.out.println(newNumber.size());
  }
}