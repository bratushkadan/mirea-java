package a02.t01;

public class TestAuthor {
  public static void main(String[] args) {
    Author a = new Author("Dan", "bratushkadan@gmail.com", 'M');

    assert a.getName().equals("Dan");
    assert a.getEmail().equals("bratushkadan@gmail.com");
    assert a.getGender() == 'M';

    a.setEmail("danilabratushka@yandex.ru");
    assert a.getEmail().equals("danilabratushka@yandex.ru");

    assert a.toString().equals("Dan (M) | danilabratushka@yandex.ru");
  }
}
