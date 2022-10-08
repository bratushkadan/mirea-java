package a02.t10;

import java.util.Scanner;

public class HowMany {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int wordCount = 0;
    while (scan.hasNextLine()) {
      String line = scan.nextLine();

      if (line == "") {
        break;
      }

      wordCount += line.split(" ").length;
    }

    scan.close();

    System.out.println(wordCount);
  }
}
