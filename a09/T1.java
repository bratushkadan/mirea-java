package a09;

public class T1 {
  public static void main(String[] args) {
    Student[] arr = { new Student("Dan", 148103, 4.92), new Student("Alex", 1481, 4.38),
        new Student("Gregory", 19934, 3.33),
        new Student("Emma", 13, 4.55) };

    for (Student st : arr) {
      System.out.format("%d %s\n", st.getId(), st.getName());
    }
    System.out.println();

    SortStudents.sort(arr);

    for (Student st : arr) {
      System.out.format("%d %s\n", st.getId(), st.getName());
    }
  }
}

class SortStudents {
  public static void sort(Student[] arr) {
    int n = arr.length;
    for (int j = 1; j < n; j++) {
      Student currentStudent = arr[j];
      int i = j - 1;
      while ((i > -1) && (arr[i].getId() > currentStudent.getId())) {
        arr[i + 1] = arr[i];
        i--;
      }
      arr[i + 1] = currentStudent;
    }
  }
}
