package a04.t2;

public class Tie extends Clothes implements ManClothing {
  private final String label = "Pants";
  public Tie(Size sz, int cost, String color) {
    this.size = sz;
    this.cost = cost;
    this.color = color;
  }
  public final String getLabel() {
    return this.label;
  }
  @Override
  public void dressMan(Clothes... cl) {
    System.out.println("Dressing man with a tie");
  }
}
