package a04.t1;

public enum Season {
  WINTER(-5),
  SPRING(8),
  SUMMER(21),
  AUTUMN(2);
  
  private final int avgTemp;
  private Season(int avgTemp) {
    this.avgTemp = avgTemp;
  }
  public final int getAvgtemp() {
    return this.avgTemp;
  }

  public static void printFavourite(Season s) {
    String sAlias = "";
    switch (s) {
      case WINTER:
        sAlias = "зиму";
        break;
      case SPRING:
        sAlias = "весну";
        break;
      case SUMMER:
        sAlias = "лето";
        break;
      case AUTUMN:
        sAlias = "осень";
        break;
    }
    System.out.format("Я люблю %s!\n", sAlias);
  }

  public final String getDescription() {
    if (this.equals(SUMMER)) {
      return "Теплое время года";
    }
    return "Холодное время года";
  }
}
