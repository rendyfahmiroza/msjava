import java.util.*;

class fib {
  static int searchFib(int n) {
    int[] number = new int[n + 2];
    number[0] = 0;
    number[1] = 1;
    
    for (int i = 2; i <= n; i++) {
      number[i] = number[i-1] + number[i-2];
    }
    
    return number[n];
  }
  
  public static void main (String[] args) {
    System.out.println(searchFib(10));
  }
}