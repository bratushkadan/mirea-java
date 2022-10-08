import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Каждое введенное вами число будем суммироваться. Введите любую фразу для завершения.");

    int sum = 0;
    for (; sc.hasNextInt();) {
      sum += sc.nextInt();
    }

    sc.close();

    System.out.format("Сумма: %d\n", sum);
  }
}
