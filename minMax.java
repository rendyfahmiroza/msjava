import java.util.*;

class minMax {
  static void searchMinMax() {
    int number[] = {2, -5, -4, 22, 7, 7};
    int min = number[0];
    int max = number[0];
    int minIndex = 0;
    int maxIndex = 0;
    
    for (int i = 1; i < number.length; i++) {
      if (min > number[i]) {
        min = number[i];
        minIndex = i;
      }
      
      if (max < number[i]) {
        max = number[i];
        maxIndex = i;
      }
    }
    
    System.out.println("min: " + min + " index: " + minIndex + " max: " + max + " index: " + maxIndex + "");
  }
  
  public static void main (String[] args) {
    searchMinMax();
  }
}