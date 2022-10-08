package a02.t07;

public class Book {
  private String name;
  private String author;
  private int year;

  public Book(String name, String author, int year) {
    this.name = name;
    this.author = author;
    this.year = year;
  }

  public final String getName() {
    return this.name;
  }

  public final void setName(String name) {
    this.name = name;
  }

  public final String getAuthor() {
    return this.author;
  }

  public final void setAuthor(String author) {
    this.author = author;
  }

  public final int getYear() {
    return this.year;
  }

  public final void setYear(int year) {
    this.year = year;
  }

  public final String toString() {
    return String.format("%s: %s - %d", this.name, this.author, this.year);
  }
}
