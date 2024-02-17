package projects;

public class cepSplit {
  public static void main(String[] args) {
    String cep = "60741-370";

    String[] cepSplit = cep.split("-");

    for (String cepPart : cepSplit) {
      System.out.println(cepPart);
    }

  }
}
