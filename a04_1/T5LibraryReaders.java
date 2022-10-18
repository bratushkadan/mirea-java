package a04_1;

import java.util.ArrayList;
import java.util.HashSet;

class Book {
  public String author;
  public String name;

  public Book(String a, String n) {
    author = a;
    name = n;
  }

  public final String toString() {
    return name;
  }
}

class Reader {
  protected String fullname;
  protected int readerNumber;
  protected String faculty;
  protected String dateOfBirth;
  protected String phoneNumber;

  protected HashSet<Book> books = new HashSet<>();

  public boolean takeBook(Book book) {
    return this.books.add(book);
  }

  public void takeBook(int count) {
    System.out.format("%s взял %d книг\n", fullname, count);
  }

  public boolean takeBook(Book... books) {
    int tookCount = 0;
    for (Book book : books) {
      if (takeBook(book)) {
        tookCount++;
      }
    }
    System.out.format("%s взял книги: ", this.fullname);
    for (Book book : this.books) {
      System.out.format("%s, ", book);
    }
    System.out.println();

    return tookCount > 0;
  }

  public boolean returnBook(Book book) {
    return this.books.remove(book);
  }

  public void returnBook(int count) {
    System.out.format("%s вернул %d книг\n", fullname, count);
  }

  public boolean returnBook(Book... books) {
    ArrayList<Book> returnedBooks = new ArrayList<>();
    for (Book book : books) {
      if (returnBook(book)) {
        returnedBooks.add(book);
      }
    }
    System.out.format("%s вернул книги: ", this.fullname);
    for (Book book : returnedBooks) {
      System.out.format("%s, ", book);
    }
    System.out.println();

    return returnedBooks.size() > 0;
  }
}

public class T5LibraryReaders {

}
