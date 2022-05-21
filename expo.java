import java.util.Scanner;

class expo {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input X: ");
    int x = input.nextInt();
    
    System.out.print("Input Y: ");
    int y = input.nextInt();
    
    int temp = 1;
    for (int i = 0; i < y; i++) {
      temp*=x;
    }
    
    System.out.print("Output:" + temp);
    System.out.println();
  }
}