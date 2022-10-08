package a02.t07;

public class TestBook {
  public static void main(String[] args) {
    Book b = new Book("C++ programming", "Stroustrup", 2008);
  
    assert b.getName().equals("C++ programming");
    assert b.getAuthor().equals("Stroustrup");
    assert b.getYear() == 2008;
    
    b.setName("C++ programming, 2nd edition");
    b.setYear(2014);

    assert b.getName().equals("C++ programming, 2nd edition");
    assert b.getAuthor().equals("Stroustrup");
    assert b.getYear() == 2014;
  }
}
