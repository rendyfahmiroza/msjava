import java.util.Scanner;

class palindrome {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Kata: ");
    String kata = input.nextLine();
    
    char temp;
    String nKata = "";
    for (int i = kata.length() - 1; i >= 0; i--) {
      temp = kata.charAt(i);
      nKata += temp;
    }
    
    if (kata.equals(nKata)) {
      System.out.println("Output: Palindrome");
    } else {
      System.out.println("Output: Bukan Palindrome");
    }
  }
}