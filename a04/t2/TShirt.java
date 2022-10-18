package a04.t2;

public class TShirt extends Clothes implements ManClothing, WomanClothing {
  private final String label = "Pants";
  public TShirt(Size sz, int cost, String color) {
    this.size = sz;
    this.cost = cost;
    this.color = color;
  }
  public final String getLabel() {
    return this.label;
  }
  @Override
  public void dressMan(Clothes... cl) {
    System.out.println("Dressing man with a T-Shirt");
  }
  @Override
  public void dressWoman(Clothes... cl) {
    System.out.println("Dressing woman with a T-Shirt");
  }
}
