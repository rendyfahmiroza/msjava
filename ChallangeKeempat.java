import java.util.*;

class ChallangeKeempat {
  public static void main (String[] args) {
    Board board = new Board();
    board.menu();
  }
}

class Kandang {
  // Bisa dibuatkan object warna setiap hewan yang di pelihara
 public Kandang(int jumlah) {
  // this.jumlah = jumlah;
 }
}

class Board {
  protected int jumlah;
  protected List<Character> animal = new ArrayList<>();
  protected Map<Integer, Character> map = new HashMap<Integer, Character>(); 
  protected int choiceGreeting;
  protected int choiceKandang;
  protected char tebakan;
  protected boolean wrongTebakan;
  protected boolean hasTebakan = false;
  protected int correct;
  
  Scanner input = new Scanner(System.in);
  
  public Board () {}
  
  public int menu () {
    System.out.print("\033[H\033[2J");
    System.out.println("----------------------");
    System.out.println("    Tebak Kandang     ");
    System.out.println("----------------------");
    System.out.println("1. Jumlah Kandang");
    System.out.println("99. Exit");
    System.out.println("----------------------");
    System.out.print("Pilih Menu: ");
    choiceGreeting = input.nextInt();
    
    if (choiceGreeting == 1) {
      System.out.print("\033[H\033[2J");
      System.out.print("Masukan jumlah kandang: ");
      jumlah = input.nextInt();
      generateKandang();
      fillKandang();
      while (correct < jumlah) {
        showKandang();
        tebakKandang();
        checkTebakan();
        
        System.out.print("\033[H\033[2J");
        System.out.println("PERCOBAAN BUKA:");
        hasTebakan = true;
        showKandang();
        hasTebakan = false;
        
        if (wrongTebakan) {
          System.out.println("Tebakan Benar");
          System.out.println();
        } else {
          System.out.println("Tebakan Salah");
          System.out.println();
        }
      }
    } else if (choiceGreeting == 99) {
      return 0;
    } else {
      menu();
    }
    return 1;
  }
  
  public void checkTebakan() {
    if (animal.get(choiceKandang - 1) == tebakan) {
      correct++;
      wrongTebakan = true;
      map.put(choiceKandang - 1, tebakan);
    } else {
      wrongTebakan = false;
    }
  }
  
  public void tebakKandang() {
    System.out.print("Pilih kandang yang ingin dibuka: ");
    choiceKandang = input.nextInt();
    System.out.println("---PILIHAN---");
    System.out.println("K: Kambing");
    System.out.println("Z: Zebra");
    System.out.println("B: Bebek");
    System.out.print("Masukkan tebakan: ");
    tebakan = input.next().charAt(0);
  }
  
  public void showKandang() {
    int i = 0;
    for(Map.Entry m : map.entrySet()) {
      System.out.println("|||");
      if (m.getKey().equals(choiceKandang - 1) && hasTebakan) {
        System.out.println("|"+ tebakan +"|");
      } else {
        System.out.println("|"+ m.getValue() + "|");
      }
      System.out.println("|||");
      System.out.println();
      i++;
    }
  }
  
  public void generateKandang() {
    for (int i = 0; i < jumlah; i++) {
      map.put(i, (char)((i+1) + '0'));
    }
  }
  
  public void fillKandang() {
    Random rand = new Random();
   
   for (int i = 0; i < jumlah; i++) {
      int random = rand.nextInt(3);
      char tempAnimal = 'K';
      if (random == 1) {
        tempAnimal = 'K';
      } else if (random == 2) {
        tempAnimal = 'B';
      } else if (random == 3) {
        tempAnimal = 'Z';
      }
      animal.add(tempAnimal);
    } 
  }
}
