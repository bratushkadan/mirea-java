package a11;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class T5 {
  private static final int N = 50000000; // 50m

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    LinkedList<Integer> ll = new LinkedList<>();

    LocalDateTime start, end;
    int s, ms;

    start = LocalDateTime.now();
    for (int i = 0; i < N; i++) {
      al.add(i);
    }
    end = LocalDateTime.now();
    s = ((end.getMinute() - start.getMinute()) * 60 + end.getSecond() - start.getSecond());
    ms = end.get(ChronoField.MILLI_OF_SECOND) - start.get(ChronoField.MILLI_OF_SECOND);
    if (ms < 0) {
      ms *= -1;
      s--;
    }
    System.out.format("Операция вставки в al заняла %dс %dмс\n", s, ms);

    start = LocalDateTime.now();
    for (int i = 0; i < N; i++) {
      ll.add(i);
    }
    end = LocalDateTime.now();
    s = ((end.getMinute() - start.getMinute()) * 60 + end.getSecond() - start.getSecond());
    ms = end.get(ChronoField.MILLI_OF_SECOND) - start.get(ChronoField.MILLI_OF_SECOND);
    if (ms < 0) {
      ms *= -1;
      s--;
    }
    System.out.format("Операция вставки в ll заняла %dс %dмс\n", s, ms);

    start = LocalDateTime.now();
    al.contains(18925013);
    end = LocalDateTime.now();
    s = ((end.getMinute() - start.getMinute()) * 60 + end.getSecond() - start.getSecond());
    ms = end.get(ChronoField.MILLI_OF_SECOND) - start.get(ChronoField.MILLI_OF_SECOND);
    if (ms < 0) {
      ms *= -1;
      s--;
    }
    System.out.format("Операция поиска в al заняла %dс %dмс\n", s, ms);

    start = LocalDateTime.now();
    ll.contains(18925013);
    end = LocalDateTime.now();
    s = (end.getSecond() - start.getSecond()) % 59;
    ms = end.get(ChronoField.MILLI_OF_SECOND) - start.get(ChronoField.MILLI_OF_SECOND);
    if (ms < 0) {
      ms *= -1;
      s--;
    }
    System.out.format("Операция поиска в ll заняла %dс %dмс\n", s, ms);
  }
}
