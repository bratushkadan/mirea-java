package a04_1;

public class T9 {

}

abstract class Furniture {
  protected final String material;
  protected final String size;

  public Furniture(String material, String size) {
    this.material = material;
    this.size = size;
  }

  public String getMaterial() {
    return this.material;
  }
}

abstract class OakFurniture extends Furniture {
  public OakFurniture(String size) {
    super("oak", size);
  }
}
abstract class BirchFurniture extends Furniture {
  public BirchFurniture(String size) {
    super("birch", size);
  }
}
abstract class SpruceFurniture extends Furniture {
  public SpruceFurniture(String size) {
    super("spruce", size);
  }
}

class OakWardrobe extends OakFurniture {
  public OakWardrobe() {
    super("large");
  }
}
class BirchWardrobe extends BirchFurniture {
  public BirchWardrobe() {
    super("large");
  }
}
class SpruceWardrobe extends SpruceFurniture {
  public SpruceWardrobe() {
    super("large");
  }
}
class OakDesk extends OakFurniture {
  public OakDesk() {
    super("medium");
  }
}
class BirchDesk extends BirchFurniture {
  public BirchDesk() {
    super("medium");
  }
}
class SpruceDesk extends SpruceFurniture {
  public SpruceDesk() {
    super("medium");
  }
}
class OakShelf extends OakFurniture {
  public OakShelf() {
    super("small");
  }
}
class BirchShelf extends BirchFurniture {
  public BirchShelf() {
    super("small");
  }
}
class SpruceShelf extends SpruceFurniture {
  public SpruceShelf() {
    super("small");
  }
}
