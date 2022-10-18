package a04.t2;

public enum Size {
  XXS(32),
  XS(34),
  S(36),
  M(38),
  L(40);

  private final int size;
  private Size(int size) {
    this.size = size;
  }
  public final int getEuSize() {
    return this.size;
  }

  public final String getSize() {
    if (this.equals(XXS)) {
      return "Детский размер";
    }
    return "Взрослый размер";
  }
}
