import java.util.*;

class primeToX {
  public static void main (String[] args) {
    System.out.println("Masukan angka ? ");
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    prime(n);
  }
  
  public static void prime(int n) {
    
    List<Integer> number = new ArrayList<>();
    
    for (int i = 2; i < 30; i++) {
      int flag = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          flag++;
        }
      }
      if (flag == 2) {
        number.add(i);
      }
    }
    
    System.out.println(number.get(n - 1));
    
  }
}