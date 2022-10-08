package a03.shell.t1;

public class TypeCast {
  public static void main(String[] args) {
    // 1. Создайте объекты класса Double, используя методы valueOf()
    Double d1 = Double.valueOf(1910.5289);
    // d1.longValue(); // - есть методы, в отличие от примитива

    // 2. Преобразовать значение типа String к типу double. Используем метод Double.parseDouble()
    Double d2 = Double.parseDouble("1910.5289");

    // 3. Преобразовать объект класса Double ко всем примитивным типам.
    float f = d2.floatValue();
    int i = d2.intValue();
    boolean bool = d2 != 0.0;
    long l = d2.intValue();
    byte by = d2.byteValue();
    short sh = d2.shortValue();

    // 4. Вывести значение объекта Double на консоль
    System.out.println(d2);

    // 5.Преобразовать литерал типа double к строке: String d = Double.toString(3.14)
    String s = Double.toString(3.14);
  }
}
