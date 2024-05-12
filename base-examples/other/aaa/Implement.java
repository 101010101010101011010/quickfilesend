import java.io.*;
import java.util.Scanner;


class ParsingData {

}


class ObjectFormat {

}


public class Implement {

  static final String INPUT_FILE = "./1/DATA21.txt"; // TODO: Verify location

  public static void main(String[] args) {
    try {
      File file = new File(INPUT_FILE);
      if (!file.exists()) {
        throw new FileNotFoundException(INPUT_FILE);
      }

      Scanner scanner = new Scanner(file);

      while (true) { 
        if (!scanner.hasNext()) {
          break;
        }

        int D = Math.abs(Integer.parseInt(scanner.nextLine()));

        int itters = Integer.parseInt(scanner.nextLine());

        int num = 0;

        for (int i = 1; i <= itters; i++) {
          String[] sections = scanner.nextLine().split(" ");
          int G = Integer.parseInt(sections[0]);
          int L = Integer.parseInt(sections[1]);

          if ((D * L) <= (100 * G)) {
            num++;
          }
        }

        System.out.println(num);
      }

      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}