class maximumBuyProduct {
  public static void main (String[] args) {
    int[] productPrice = {15000, 10000, 12000, 5000, 3000};
    int money = 40000;
    int buy = 0;
    int tempProduct = 0;
    
    for (int i = 0; i < productPrice.length; i++) {
      if (money >= productPrice[i] && tempProduct != productPrice[i]) {
        buy++;
        money -= productPrice[i];
        tempProduct = productPrice[i];
      }
    } 
    
    System.out.println(buy);
  }
}