package a09;

import java.util.Comparator;

public class SortingStudentsByGPAComparator implements Comparator<Student> {
  public int compare(Student a, Student b) {
    if (a.getGPA() > b.getGPA()) {
      return 1;
    }
    if (a.getGPA() < b.getGPA()) {
      return -1;
    }
    return 0;
  }
}
