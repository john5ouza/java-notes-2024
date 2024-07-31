package projects;

public class cpfSplit {
  public static void main(String[] args) {
    String cpf = "020.634.033.84";
    String[] cpfSplit = cpf.split("\\.");

    for (String cpfPart : cpfSplit) {
      System.out.println(cpfPart);
    }
  }
}
