package a02.t09;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
  private static final String[] suits = { "♠", "♣", "⬥", "♥" };
  private static final String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
  private final ArrayList<String> deck = new ArrayList<String>();

  public Poker() {
    this.generateCards();

  }

  private final void generateCards() {
    for (int i = 0; i < 52; i++) {
      this.deck.add(String.format("%s %s", Poker.suits[i % 4], Poker.cards[i % 13]));
    }
  }

  private final void shuffleCards() {
    Collections.shuffle(this.deck);
  }

  public final ArrayList<ArrayList<String>> getCardsForPlayers(int playersCount) throws Exception {
    // 52 - 5 = 47 --> 47 // 5 = 9
    if (playersCount < 1 || playersCount > 9) {
      throw new Exception("[Poker] [getCardsForPlayer]: number of players must be between 1 and 9.");
    }

    this.shuffleCards();
    ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();

    for (int k = 0; k < playersCount; k++) {
      ArrayList<String> cardsForPlayer = new ArrayList<String>();
      for (int i = 0; i < 5; i++) {
        cardsForPlayer.add(this.deck.get(k * 5 + i));
      }
      res.add(cardsForPlayer);
    }

    return res;
  }

  public final String toString() {
    return this.deck.toString();
  }
}
