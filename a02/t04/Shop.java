package a02.t04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Shop {
  private HashSet<String> computers;

  public Shop() {
    this.computers = new HashSet<String>();
  }

  public final boolean addComputer(String article) {
    return this.computers.add(article);
  }

  public final boolean removeComputer(String article) {
    return this.computers.remove(article);
  }

  public final ArrayList<String> searchComputer(String articleFragment) {
    ArrayList<String> result = new ArrayList<String>();

    Iterator<String> it = this.computers.iterator();

    while (it.hasNext()) {
      String article = it.next();
      if (article.contains(articleFragment)) {
        result.add(article);
      }
    }

    return result;
  }

  public final String toString() {
    return this.computers.toString();
  }
}
