class bilanganPrima {
  public static void main (String[] args) {
    int bilangan = 10;
    
    for (int i = bilangan; i > 0 ; i--) {
      if (bilangan % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}