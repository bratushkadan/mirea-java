package a02.t05;

import java.util.ArrayList;

public class DogKennel {
  private final ArrayList<Dog> dogs = new ArrayList<Dog>();

  public void addDogs(Dog... dogs) {
    for (int i = 0; i < dogs.length; i++) {
      this.dogs.add(dogs[i]);
    }
  }
}
