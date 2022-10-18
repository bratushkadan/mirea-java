package a04_1;

public class T7 {
  public static void main(String[] args) {
    Learner[] arr = {new Pupil().setName("Dan"), new Student().setName("Adonis"), new Pupil().setName("Jeffrey"), new Learner().setName("Andrew")};

    for (Learner l : arr) {
      if (l instanceof Pupil) {
        System.out.format("%s — школьник\n", l.getName());
      } else if (l instanceof Student) {
        System.out.format("%s — студент\n", l.getName());
      } else {
        System.out.format("%s — обычный любитель что-то поизучать\n", l.getName());
      }
    }
  }
}

class Learner {
  private String name;

  public final String getName() {
    return this.name;
  }

  public final Learner setName(String n) {
    name = n;
    return this;
  }
}

class Pupil extends Learner {

}

class Student extends Learner {
}
