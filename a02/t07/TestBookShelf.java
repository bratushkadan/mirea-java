package a02.t07;

public class TestBookShelf {
  public static void main(String[] args) {
    BookShelf bsh = new BookShelf(new Book("foo", "Dan", 2022), new Book("bar", "Andrew", 2020),
        new Book("baz", "Matthew", 2022), new Book("qux", "Derek", 2017));

    assert bsh.earliestBook().toString().equals("qux: Derek - 2017");
    assert bsh.latestBook().toString().equals("foo: Dan - 2022");

    assert bsh.toString().equals("[foo: Dan - 2022, bar: Andrew - 2020, baz: Matthew - 2022, qux: Derek - 2017]");

    bsh.arrangeBooksByYear();

    assert bsh.toString().equals("[qux: Derek - 2017, bar: Andrew - 2020, foo: Dan - 2022, baz: Matthew - 2022]");

    BookShelf emptyBsh = new BookShelf();

    assert emptyBsh.earliestBook() == null;
    assert emptyBsh.latestBook() == null;
  }
}
