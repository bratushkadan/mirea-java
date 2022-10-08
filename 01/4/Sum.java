import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Каждое введенное вами число будем суммироваться. Введите любую фразу для завершения.");

    int sum = 0;
    boolean numericInput = true;
    do {
      try {
        sum += Integer.parseInt(sc.nextLine());
      } catch (java.lang.NumberFormatException e) {
        numericInput = false;
      }
    } while (numericInput);

    sc.close();

    System.out.format("Сумма: %d\n", sum);
  }

  public static void whileVersion(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Каждое введенное вами число будем суммироваться. Введите любую фразу для завершения.");

    int sum = 0;
    while (sc.hasNextInt()) {
      sum += sc.nextInt();
    }

    sc.close();

    System.out.format("Сумма: %d\n", sum);
  }
}
