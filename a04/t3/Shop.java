package a04.t3;

import java.util.HashMap;
import java.util.Scanner;

public class Shop {
  private final Scanner sc = new Scanner(System.in);
  private final HashMap<Catalogues, HashMap<String, Integer>> cart = new HashMap<>();

  public static void main(String[] args) {
    Shop s = new Shop();

    // s.auth();
    Operations op = Operations.ADD_TO_CART;
    loop:
    while (op != Operations.EXIT) {
      op = s.promptCmd();
      switch (op) {
        case SHOW_CATALOGUES:
          s.showCatalogues();
          break;
        case SHOW_CATALOGUE_ASSORTMENT:
          s.showCatalogueAssortment();
          break;
        case ADD_TO_CART:
          s.addToCart();
          break;
        case SHOW_CART:
          s.showCart();
          break;
        case MENU:
          break;
        case EXIT:
          break loop;
      }
    }

    System.out.println("До встречи!");
  }

  public final void showCatalogueAssortment() {
    Catalogues cat = this.promptCatalogues();
    int i = 1;
    switch (cat) {
      case Electronics:
          for (Electronics c : Electronics.values()) {
            System.out.format("%d. %s\n", i, c);
            i++;
          }
          System.out.println("---");
          break;
          case Groceries:
          for (Groceries c : Groceries.values()) {
            System.out.format("%d. %s\n", i, c);
            i++;
          }
          System.out.println("---");
          break;
          case Clothes:
          for (Clothes c : Clothes.values()) {
            System.out.format("%d. %s\n", i, c);
            i++;
          }
          System.out.println("---");
          break;
          case Furniture:
          for (Furniture c : Furniture.values()) {
            System.out.format("%d. %s\n", i, c);
            i++;
          }
          System.out.println("---");
        break;
    }
  }

  public final void addToCart() {
    Catalogues catalogue = this.promptCatalogues();
    if (!this.cart.containsKey(catalogue)) {
      this.cart.put(catalogue, new HashMap<String, Integer>());
    }
    HashMap<String, Integer> entry = this.cart.get(catalogue);
    String key = "";
    switch (catalogue) {
      case Electronics:
        key = this.promptElectronics().toString();
        break;
      case Groceries:
        key = this.promptGroceries().toString();
        break;
      case Clothes:
        key = this.promptClothes().toString();
        break;
      case Furniture:
        key = this.promptFurniture().toString();
        break;
    }

    if (!entry.containsKey(key)) {
      entry.put(key, 1);
    } else {
      entry.put(key, entry.get(key) + 1);
    }
  }

  public final void auth() {
    System.out.print("Войдите в магазин: \nЛогин: ");
    String username = this.sc.nextLine();
    System.out.print("Пароль: ");
    String pass = this.sc.nextLine();
    System.out.format("Добро пожаловать, %s!\n", username);
  }

  public final void showCart() {
    System.out.println("===== Cart");
    for (Catalogues cat : this.cart.keySet()) {
      System.out.format("\t=== %s\n", cat);
      HashMap<String, Integer> entry = this.cart.get(cat);
      for (String key : entry.keySet()) {
        System.out.format("\t\t- %s: %d\n", key, entry.get(key));
      }
    }
    System.out.println("=====");
  }

  public final Operations promptCmd() {
    int i = 1;
    for (Operations op : Operations.values()) {
      System.out.format("%d. %s\n", i, op);
      i++;
    }
    System.out.print("Введите команду: ");
    while (this.sc.hasNextLine()) {
      String s = this.sc.nextLine();
      try {
        return Operations.valueOf(s);
      } catch (java.lang.IllegalArgumentException err) {
        return this.promptCmd();
      }
    }
    return Operations.EXIT;
  }
  public final void showCatalogues() {
    System.out.println("---");
    int i = 1;
    for (Catalogues cat : Catalogues.values()) {
      System.out.format("%d. %s\n", i, cat);
      i++;
    }
    System.out.println("---");
  }
  public final Catalogues promptCatalogues() {
    this.showCatalogues();
    System.out.print("Введите нужный каталог: ");
    while (this.sc.hasNextLine()) {
      String s = this.sc.nextLine();
      try {
        return Catalogues.valueOf(s);
      } catch (java.lang.IllegalArgumentException err) {
        return this.promptCatalogues();
      }
    }
    // сюда не доберемся
    return Catalogues.Furniture;
  }
  public final Groceries promptGroceries() {
    int i = 1;
    for (Groceries cat : Groceries.values()) {
      System.out.format("%d. %s\n", i, cat);
      i++;
    }
    System.out.print("Введите нужный товар: ");
    while (this.sc.hasNextLine()) {
      String s = this.sc.nextLine();
      try {
        return Groceries.valueOf(s);
      } catch (java.lang.IllegalArgumentException err) {
        return this.promptGroceries();
      }
    }
    // сюда не доберемся
    return Groceries.Apples;
  }
  public final Electronics promptElectronics() {
    int i = 1;
    for (Electronics cat : Electronics.values()) {
      System.out.format("%d. %s\n", i, cat);
      i++;
    }
    System.out.print("Введите нужный товар: ");
    while (this.sc.hasNextLine()) {
      String s = this.sc.nextLine();
      try {
        return Electronics.valueOf(s);
      } catch (java.lang.IllegalArgumentException err) {
        return this.promptElectronics();
      }
    }
    // сюда не доберемся
    return Electronics.Computer;
  }
  public final Clothes promptClothes() {
    int i = 1;
    for (Clothes cat : Clothes.values()) {
      System.out.format("%d. %s\n", i, cat);
      i++;
    }
    System.out.print("Введите нужный товар: ");
    while (this.sc.hasNextLine()) {
      String s = this.sc.nextLine();
      try {
        return Clothes.valueOf(s);
      } catch (java.lang.IllegalArgumentException err) {
        return this.promptClothes();
      }
    }
    // сюда не доберемся
    return Clothes.Pants;
  }
  public final Furniture promptFurniture() {
    int i = 1;
    for (Furniture cat : Furniture.values()) {
      System.out.format("%d. %s\n", i, cat);
      i++;
    }
    System.out.print("Введите нужный товар: ");
    while (this.sc.hasNextLine()) {
      String s = this.sc.nextLine();
      try {
        return Furniture.valueOf(s);
      } catch (java.lang.IllegalArgumentException err) {
        return this.promptFurniture();
      }
    }
    // сюда не доберемся
    return Furniture.Desk;
  }
}

enum Operations {
  MENU(1),
  SHOW_CATALOGUES(2),
  SHOW_CATALOGUE_ASSORTMENT(3),
  ADD_TO_CART(4),
  SHOW_CART(5),
  EXIT(6);

  private int opNo;

  private Operations(int opNo) {
    this.opNo = opNo;
  }

  public final int getCatalogueNum() {
    return this.opNo;
  }
}

enum Catalogues {
  Electronics(1),
  Clothes(2),
  Groceries(3),
  Furniture(4);

  private int catNo;

  private Catalogues(int catNo) {
    this.catNo = catNo;
  }

  public final int getCatalogueNum() {
    return this.catNo;
  }
}

enum Electronics {
  Computer(1),
  Phone(2),
  TV(3),
  Display(4),
  Lamp(5);

  private int productNo;

  private Electronics(int productNo) {
    this.productNo = productNo;
  }

  public final int getProductNum() {
    return this.productNo;
  }
}

enum Clothes {
  Skirt(1),
  TShirt(2),
  Tie(3),
  Pants(4),
  Skitters(5);

  private int productNo;

  private Clothes(int productNo) {
    this.productNo = productNo;
  }

  public final int getProductNum() {
    return this.productNo;
  }
}

enum Groceries {
  Cabbage(1),
  Tomatoes(2),
  Potatoes(3),
  Aubergines(4),
  Apples(5),
  CleaningAgent(6),
  Coffee(7);

  private int productNo;

  private Groceries(int productNo) {
    this.productNo = productNo;
  }

  public final int getProductNum() {
    return this.productNo;
  }
}

enum Furniture {
  Desk(1),
  Wardrobe(2),
  Door(3);

  private int productNo;

  private Furniture(int productNo) {
    this.productNo = productNo;
  }

  public final int getProductNum() {
    return this.productNo;
  }
}
