package a11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class T3 {
  public static void main(String[] args) {
    Student dan = new Student(LocalDateTime.of(LocalDate.of(2003, 5, 28), LocalTime.of(9, 58, 22)));

    System.out.println(dan.toString(Student.StudentDateFormat.LONG));
    System.out.println(dan.toString(Student.StudentDateFormat.SHORT));
    System.out.println(dan.toString(Student.StudentDateFormat.NORMAL));
  }
}

class Student {
  public enum StudentDateFormat {
    LONG,
    NORMAL,
    SHORT;
  }

  private static DateTimeFormatter longStudentDateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
  private static DateTimeFormatter normalStudentDateFormat = DateTimeFormatter.ofPattern("dd.MM.YYYY");
  private static DateTimeFormatter shortStudentDateFormat = DateTimeFormatter.ofPattern("dd.MM.YY");

  private LocalDateTime dateOfBirth;

  public Student(LocalDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public final String toString(StudentDateFormat... args) {
    StudentDateFormat f = args.length > 0 ? args[0] : StudentDateFormat.NORMAL;

    try {
      switch (f) {
        case LONG:
          return dateOfBirth.format(longStudentDateFormat);
        case SHORT:
          return dateOfBirth.format(normalStudentDateFormat);
        case NORMAL:
        default:
          return dateOfBirth.format(shortStudentDateFormat);
      }
    } catch (Exception err) {
      System.err.println(err);
      System.exit(1);
    }
    return "";
  }

}
