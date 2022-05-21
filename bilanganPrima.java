class bilanganPrima {
  public static void main (String[] args) {
    int bilangan = 1000;
    int temp = 0;
    for (int i = 1; i <= bilangan; i++) {
      if (bilangan % i == 0) {
        temp++;
      }
    }
    
    if (temp == 2) {
      System.out.println("Bilangan Prima");
    } else {
      System.out.println("Bilangan Bukan Prima");
    }
  }
}