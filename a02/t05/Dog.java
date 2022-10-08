package a02.t05;

public class Dog {
  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public final String getName() {
    return this.name;
  }

  public final void setName(String name) {
  }

  public final int getAge() {
    return this.age;
  }

  public final void setAge(int age) {
    this.age = age;
  }

  public final int getHumanAge() {
    return this.age * 7;
  }

  public final String toString() {
    return String.format("Dog: {name: %s, age: %d, human_age: %d}", this.name, this.age, this.getHumanAge());
  }
}
