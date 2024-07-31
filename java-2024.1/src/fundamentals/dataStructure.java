package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class dataStructure {
  public static void main(String[] args) {
    List<String> fullNames = new ArrayList<>();
    fullNames.add("JOHN");
    fullNames.add("YTALO");
    fullNames.add("SOUZA");

    for (String item : fullNames) {
      System.out.println(item);
    }
  }
}
