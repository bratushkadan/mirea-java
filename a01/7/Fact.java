/* Написать программу, которая с помощью метода класса,
вычисляет факториал числа
(использовать управляющую конструкцию цикла),
проверить работу метода. */

// запустить програму с флагом -ea — enable assertions
// java -ea Fact
public class Fact {
  public static void main(String[] args) {
    assert Fact.calc(5) == 120;
    assert Fact.calc(0) == 1;
    assert Fact.calc(6) == 720;
    assert Fact.calc(3) == 6;
    assert Fact.calc(18) == 6402373705728000L;
  }

  public static long calc(int n) {
    long fact = 1;
    // (использовать управляющую конструкцию цикла)
    // не понял, зачем это условие ^ в задании
    while (n != 0) {
      fact = fact * n;
      n--;
      if (n > 1) {
        continue;
      }
    }

    return fact;
  }
}
