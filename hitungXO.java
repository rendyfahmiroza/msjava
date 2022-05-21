import java.util.Scanner;

class hitungXO {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukan Text: ");
    String text = input.nextLine();
    
    int x = 0;
    int o = 0;
    for (int i=0; i < text.length() ; i++) {
      char temp = text.charAt(i);
      
      if (temp == 'X' || temp == 'x') {
        x++;
      }
      
      if (temp == 'O' || temp =='o') {
        o++;
      }
    }
    
    if (x == o) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}