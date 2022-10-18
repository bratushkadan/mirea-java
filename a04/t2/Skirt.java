package a04.t2;

public class Skirt extends Clothes implements WomanClothing {
  private final String label = "Pants";
  public Skirt(Size sz, int cost, String color) {
    this.size = sz;
    this.cost = cost;
    this.color = color;
  }
  public final String getLabel() {
    return this.label;
  }
  @Override
  public void dressWoman(Clothes... cl) {
    System.out.println("Dressing woman with a skirt");
  }
}
