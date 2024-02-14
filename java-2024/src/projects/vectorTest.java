package projects;

public class vectorTest {
  public static void main(String[] args) {
    int[] vector03 = { 10, 20, 30 };

    int sum = 0;
    for (int i = 0; i < vector03.length; i++) {
      sum += vector03[i];
    }
    System.out.println(sum);
  }
}
