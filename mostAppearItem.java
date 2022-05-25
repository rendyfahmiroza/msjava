import java.util.*;

public class mostAppearItem {
  public static void main (String[] args) {
    String[] data = {"js", "js", "golang", "ruby", "ruby", "js", "js"};
    Map<String, Integer> map = new HashMap<String, Integer>();
    // map.put(data[0], 0);
    
    for (int i = 0; i < data.length; i++) {
      if (!map.containsKey(data[i])) {
        map.put(data[i], 1);
      } else {
        int temp = map.get(data[i]);
        temp++;
        map.put(data[i], temp);
      }
    }
    
    List list = new ArrayList(map.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
            return e1.getValue().compareTo(e2.getValue());
        }
    });
                            
    System.out.println(list);
  }
}