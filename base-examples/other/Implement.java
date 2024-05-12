import java.io.*;
import java.util.Scanner;


class ParsingData {

}


class ObjectFormat {

}


public class Implement {

  static final String INPUT_FILE = "./1/DATA11.txt"; // TODO: Verify location

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

        int itters = Integer.parseInt(scanner.next());

        int num = 0;

        for (int i = itters; i >= 0; i--) {
          String[] sections = scanner.nextLine().split(" ");
          String action = sections[0].toLowerCase();

          if (action.equals("inc")) {
            num++;
            continue;
          }

          if (action.equals("mul")) {
            int num2 = Integer.parseInt(sections[1]);
            num *= num2;
            continue;
          }

          if (action.equals("dec")) {
            num--;
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