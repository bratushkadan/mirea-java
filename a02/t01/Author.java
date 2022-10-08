package a02.t01;

public class Author {
  private String name;
  private String email;
  private char gender; // 'M' | 'F'

  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  /* If you don't want the ability to override existing values,
  declare the attribute as final: */
  public final String getName() {
    return this.name;
  }

  public final String getEmail() {
    return email;
  }

  public final void setEmail(String email) {
    this.email = email;
  }

  public final char getGender() {
    return this.gender;
  }

  public final String toString() {
    return String.format("%s (%c) | %s", this.name, this.gender, this.email);
  }
}
