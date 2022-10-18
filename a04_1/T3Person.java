package a04_1;

public class T3Person {
  private String fullName;
  private int age;

  public T3Person(String name, int age) {
    this.fullName = name;
    this.age = age;
  }
  public T3Person() {
    this("Adonis", 24);
  }

  public void move() {
    System.out.format("%s двигается\n", fullName);
  }
  public void talk() {
    System.out.format("%s говорит\n", fullName);
  }
}
