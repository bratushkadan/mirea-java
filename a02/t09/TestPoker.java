package a02.t09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestPoker {
  public static void main(String[] args) {
    Poker deck = new Poker();

    assert deck.toString().equals("[♠ 2, ♣ 3, ⬥ 4, ♥ 5, ♠ 6, ♣ 7, ⬥ 8, ♥ 9, ♠ 10, ♣ J, ⬥ Q, ♥ K, ♠ A, ♣ 2, ⬥ 3, ♥ 4, ♠ 5, ♣ 6, ⬥ 7, ♥ 8, ♠ 9, ♣ 10, ⬥ J, ♥ Q, ♠ K, ♣ A, ⬥ 2, ♥ 3, ♠ 4, ♣ 5, ⬥ 6, ♥ 7, ♠ 8, ♣ 9, ⬥ 10, ♥ J, ♠ Q, ♣ K, ⬥ A, ♥ 2, ♠ 3, ♣ 4, ⬥ 5, ♥ 6, ♠ 7, ♣ 8, ⬥ 9, ♥ 10, ♠ J, ♣ Q, ⬥ K, ♥ A]");

    try {
      ArrayList<ArrayList<String>> cards = deck.getCardsForPlayers(5);

      assert cards.size() == 5;
      assert cards.get(0).size() == 5;

      cards = deck.getCardsForPlayers(8);

      System.out.println(cards);

      assert cards.size() == 8;
      assert cards.get(0).size() == 5;

      assert !playerCardsHaveDuplicates(cards);

    } catch (Exception err) {} 
  }

  private static boolean playerCardsHaveDuplicates(ArrayList<ArrayList<String>> cards) {
    HashSet<String> set = new HashSet<>();

    Iterator<ArrayList<String>> it = cards.iterator();
    while (it.hasNext()) {
      Iterator<String> it2 = it.next().iterator();
      while (it2.hasNext()) {
        String val = it2.next();
        boolean added = set.add(val);
        if (!added) {
          return true;
        }
      }
    }
    
    return false;
  }
}
