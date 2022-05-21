import java.util.Scanner;

class hitungText { 
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukan Text: ");
    String text = input.nextLine();
    text = text.toLowerCase();
    text = text.replaceAll("\\s", "");
    
    int consonant = 0;
    int vowel = 0;
    for (int i = 0; i < text.length() ; i++) {
      char temp = text.charAt(i);
      if (temp == 'a' || temp == 'i' || temp == 'u' || temp == 'e' || temp == 'o') {
        vowel++;
      } else {
        consonant++;
      }
    }
    
    System.out.println("Huruf Vokal: "+ vowel);
    System.out.println("Huruf Konsonan: "+ consonant);
    System.out.println("Jumlah Huruf: "+ text.length());
  }
}