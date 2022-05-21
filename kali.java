import java.util.Scanner;

class kali {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input X: ");
    int numberX = input.nextInt();
    
    for (int i = 1; i <= numberX; i++) {
      for (int j = 1; j <= numberX; j++) {
        System.out.print("| " + j * i + "  | ");
      }
      System.out.println();
    }
    
    
  }
}