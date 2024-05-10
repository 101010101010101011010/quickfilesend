
import java.io.*;
import java.util.Scanner;


class ParsingData {

}


class ObjectFormat {

}


public class ParseBase {

  static final String inputFile = "./ecoo2020/data/P1/data.in"; // TODO: Verify location

  public static void main(String[] args) {
    try {
      File file = new File(inputFile);
      if (!file.exists()) {
        throw new FileNotFoundException(inputFile);
      }

      Scanner scanner = new Scanner(file);

      System.out.println(scanner.next());

      ObjectFormat object = new ObjectFormat();

      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}