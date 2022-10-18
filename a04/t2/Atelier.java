package a04.t2;

public class Atelier implements ManClothing, WomanClothing {
  public static void main(String[] args) {
    Atelier a = new Atelier();
    a.dressWoman(new Tie(Size.M, 500, "blue"), new Skirt(Size.S, 1200, "magenta"));
    a.dressMan(new Tie(Size.M, 500, "blue"), new Skirt(Size.S, 1200, "magenta"),
        new TShirt(Size.XXS, 900, "white"));
  }

  public void dressWoman(Clothes... clothes) {
    for (Clothes cl : clothes) {
      if (cl instanceof WomanClothing) {
        System.out.format("%s | %s | %d | %s\n", cl.getLabel(), cl.size, cl.cost, cl.color);
      }
    }
  }

  public void dressMan(Clothes... clothes) {
    for (Clothes cl : clothes) {
      if (cl instanceof ManClothing) {
        System.out.format("%s | %s | %d | %s\n", cl.getLabel(), cl.size, cl.cost, cl.color);
      }
    }
  }
}
