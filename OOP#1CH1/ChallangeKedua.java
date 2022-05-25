import java.util.*;

class ChallangeKedua {
 public static void main (String[] args) {
   Calculator newCalc = new Calculator();
   newCalc.init();
 } 
}

class Calculator {
  protected int valueA = 0;
  protected int valueB = 0;
  protected int choice = 0;
  
  public Calculator() {
  }
  
  public void header() {
    System.out.println("+++++++++++ CALCULATOR +++++++++++");
  }
  
  public int init() {
    Scanner input = new Scanner(System.in);
    header();
    System.out.println("1: Open Calculator");
    System.out.println("99: Exit");
    System.out.println("Masukan pilihan anda: ");
    choice = input.nextInt();
    
    if (choice == 1) {
      inputData();
    } else if (choice == 99) {
      return 0;
    } else {
      System.out.println("Pilihan tidak ada");
      init();
    }
    
    return 1;
  }
  
  public void inputData() {
    Scanner input = new Scanner(System.in);
    header();
    System.out.print("Masukan Value 1 : ");
    valueA = input.nextInt();
    System.out.print("Masukan Value 2 : ");
    valueB = input.nextInt();
    
    operated();
  }
  
  public void operated () {
    Scanner input = new Scanner(System.in);
    header();
    System.out.println("Please Enter Calculation Operation:");
    System.out.println("1. Add Value");
    System.out.println("2. Sub Value");
    System.out.println("3. Multiply Value");
    System.out.println("4. Divide Value");
    header();
    System.out.print("Pilihan Anda: ");
    choice = input.nextInt();
    if (choice == 1) {
      System.out.println(add());
    } else if (choice == 2) {
      System.out.println(sub());
    } else if (choice == 3) {
      System.out.println(multiply());
    } else if (choice == 4) {
      System.out.println(divide());
    }
  }
  
  public int add() {
    return valueA + valueB;
  }
  
  public int sub() {
    return valueA - valueB;
  }
  
  public int multiply() {
    return valueA * valueB;
  }
  
  public int divide() {
    return valueA / valueB;
  }
  
}