import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


class ParsingData {

}


class ObjectFormat {

}


public class Implement {

  static final String INPUT_FILE = "./1/sample.in"; // TODO: Verify location

  public static void main(String[] args) {
    try {
      File file = new File(INPUT_FILE);
      if (!file.exists()) {
        throw new FileNotFoundException(INPUT_FILE);
      }

      Scanner scanner = new Scanner(file);

      while (true) { 
        int val = aaa(scanner);

        if (val == -1) {
          break;
        }
      }

      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static int aaa(Scanner scanner) {
    if (!scanner.hasNext()) {
      return -1;
    }

    System.out.println("aaaaa");

    int n = Integer.parseInt(scanner.nextLine());

    int x = Integer.parseInt(scanner.nextLine());

    String entry = scanner.nextLine();
    String[] sections = entry.split(" ");
    // if (sections.length <= 0) {
    //   System.out.println(-1);
    //   return;
    // }
    int dLen = sections.length;
    try {
      Integer.parseInt(sections[0]);
    } catch (Exception e) {
      dLen = 0;
    }

    Integer[] d = new Integer[dLen];
    if (dLen > 0) {
      int max = 0;
      for (int i = 0; i < sections.length; i++) {

        if (sections[i].length() < 1) { continue; }
        
        d[i] = Integer.parseInt(sections[i]);

        if (sections.length <= max) {
          System.out.println(-1);
          return -1;
        }

        if (i == 0) {
          max = 1;
          continue;
        }

        if (d[i - 1] + 1 == d[i]) {
          max++;
        } else {
          max = 0;
        }
      }

      if (sections.length <= max) {
        System.out.println(-1);
        return 0;
      }
    }

    int num = 0;

    for (int day = n; day < x;) {
      int i = -1;
      if (d.length >= 1) {
        i = Arrays.binarySearch(d, day);
      }
      if (i < 0) {
        day += n;
        num++;
        continue;
      }

      day -= 1;
    }

    System.out.println(num);
    System.out.println("end");

    return 0;
  }
}