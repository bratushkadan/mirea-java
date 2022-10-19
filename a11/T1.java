package a11;

import java.time.LocalDate;
import java.time.Month;

public class T1 {
  public static void main(String[] args) {
    System.out.println("Danila Bratushka — bratushkadan");

    LocalDate dateTaskIssued = LocalDate.of(2022, Month.SEPTEMBER, 18);
    LocalDate dateTaskCompleted = LocalDate.of(2022, Month.OCTOBER, 19);
    LocalDate dateTaskHandedIn = LocalDate.now();

    System.out.format("Task issued: %s\n", dateTaskIssued);
    System.out.format("Task completed: %s\n", dateTaskCompleted);
    System.out.format("Task handed in: %s\n", dateTaskHandedIn);
  }
}
