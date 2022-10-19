package a11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T2 {
  private static SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

  public static void main(String[] args) {
    LocalDateTime startOfDay = LocalDate.now().atStartOfDay();
    LocalDateTime currentTime = LocalDateTime.now();
    LocalDateTime enteredTime;

    System.out.println("Введите дату и время в формате дд.мм.гггг ЧЧ:мм:сс");
    System.out.print("Ввод: ");
    Scanner sc = new Scanner(System.in);
    String sTime = sc.nextLine();
    enteredTime = LocalDateTime.parse(sTime, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
    sc.close();
    System.out.println();

    System.out.format("Начало дня: %s\n", outputLocalDateTime(startOfDay));
    System.out.format("Текущее время: %s\n", outputLocalDateTime(currentTime));
    System.out.format("Введённая дата: %s\n\n", outputLocalDateTime(enteredTime));

    System.out.format("Разница во времени с начала дня до текущего времени: %dч %dм %dс\n",
        currentTime.getHour() - startOfDay.getHour(), currentTime.getMinute() - startOfDay.getMinute(),
        currentTime.getSecond() - startOfDay.getSecond());

    int comparisonResult = enteredTime.compareTo(currentTime);
    if (comparisonResult == 1) {
      System.out.println("Введенная дата больше текущей");
    } else if (comparisonResult == 0) {
      System.out.println("Введенная дата равна текущей");
    } else {
      System.out.println("Введенная дата меньше текущей");
    }

    System.out.format("Разница во времени с введенной даты до текущего времени: %dг %dм %dд %dч %dм %dс\n",
        Math.abs(currentTime.getYear() - enteredTime.getYear()),
        Math.abs(currentTime.getMonthValue() - enteredTime.getMonthValue()),
        Math.abs(currentTime.getDayOfMonth() - enteredTime.getDayOfMonth()),
        Math.abs(currentTime.getHour() - enteredTime.getHour()),
        Math.abs(currentTime.getMinute() - enteredTime.getMinute()),
        Math.abs(currentTime.getSecond() - enteredTime.getSecond()));
  }

  public static String outputLocalDateTime(LocalDateTime dt) {
    try {
      Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
          .parse(dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
      return outputDateFormat.format(date);
    } catch (Exception err) {
      return "";
    }
  }
}
