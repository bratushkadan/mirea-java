package a04_1;

public class T4Matrix {
  private final double[][] matrix;
  private final int columns;
  private final int rows;

  public T4Matrix(int c, int r) {
    this.columns = c;
    this.rows = r;
    matrix = new double[c][r];
  }
  public int getColumns() {
    return columns;
  }
  public int getRows() {
    return rows;
  }
  public double getCell(int c, int r) {
    return matrix[c][r];
  }
  public void setCell(int c, int r, double val) {
    this.matrix[c][r] = val;
  }
  public final void print() {
    for (double [] col : matrix) {
      for (double cell : col) {
        System.out.format("%s ", cell);
      }
      System.out.println();
    }
  }
}
