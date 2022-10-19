package a09;

public class Student implements Comparable {
  private String name;
  private int id;
  private double GPA;

  public Student(String name, int id, double gpa) {
    this.name = name;
    this.id = id;
    this.GPA = gpa;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public double getGPA() {
    return GPA;
  }

  public String toString() {
    return String.format("%d %s | GRA: %.2f", getId(), getName(), getGPA());
  }

  @Override
  public int compareTo(Object s) {
    if (this.getGPA() > ((Student) s).getGPA()) {
      return 1;
    }
    if (this.getGPA() < ((Student) s).getGPA()) {
      return -1;
    }
    return 0;
  }
}