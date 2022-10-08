package a02.t07;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class BookShelf {
  private final ArrayList<Book> books = new ArrayList<Book>();

  public BookShelf(Book... books) {
    for (int i = 0; i < books.length; i++) {
      this.books.add(books[i]);
    }
  }

  public final Book earliestBook() {
    if (this.books.size() == 0) {
      return null;
    }

    int index = 0;
    int minYear = this.books.get(0).getYear();
    for (int i = 1; i < this.books.size(); i++) {
      int year = this.books.get(i).getYear();
      if (year < minYear) {
        minYear = year;
        index = i;
      }
    }

    return this.books.get(index);
  }

  public final Book latestBook() {
    if (this.books.size() == 0) {
      return null;
    }

    int index = 0;
    int maxYear = this.books.get(0).getYear();
    for (int i = 1; i < this.books.size(); i++) {
      int year = this.books.get(i).getYear();
      if (year > maxYear) {
        maxYear = year;
        index = i;
      }
    }

    return this.books.get(index);
  }

  public final void arrangeBooksByYear() {
    Collections.sort(this.books, new SortByYear());
  }

  public final String toString() {
    return this.books.toString();
  }
}

class SortByYear implements Comparator<Book> {
  public int compare(Book a, Book b) {
    return a.getYear() - b.getYear();
  }
}
