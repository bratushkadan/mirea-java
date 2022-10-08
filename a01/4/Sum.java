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

    int sum = 0, min = 0, max = 0;
    boolean noInput = true;
    while (sc.hasNextInt()) {
      int num = sc.nextInt();
      if (noInput) {
        min = num;
        max = num;
        noInput = false;
      } else {
        min = Math.min(min, num);
        max = Math.max(max, num);
      }
      
      sum += num;
    }

    sc.close();

    System.out.format("Сумма: %d\n", sum);
    if (!noInput) {
      System.out.format("Минимальное число: %d\nмаксимальное число: d\n", min, max);
    }
  }
}
