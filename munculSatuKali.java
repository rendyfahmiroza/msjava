import java.util.*;

class munculSatuKali {
  public static void main (String[] args) {
    HashSet<Integer> number = new HashSet<>();
    int angka = 76523752;
    String temp = Integer.toString(angka);
    
    for (int i = 0; i < temp.length(); i++) {
      int tempNumber = Character.getNumericValue(temp.charAt(i));
      number.add(tempNumber);
    }
    
    System.out.println(number);
  }
}