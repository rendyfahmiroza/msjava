import java.util.Scanner;

class asterik {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input: ");
    int x = input.nextInt();
    
    for (int i = 0; i < x; i++) {
      for (int k = i; k < x; k++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 0; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}