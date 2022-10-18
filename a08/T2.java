package a08;

// Замечание. Задания по этой теме выполняются следующим образом:
// каждый учащийся выполняет от 3 до 5 задач, начиная с номера
// варианта задания, который соответствует номеру учащегося в журнале группы.
public class T2 {
  public static void main(String[] args) {
    printNaturalNumbersUpToN(25);
  }

  public static void printNaturalNumbersUpToN(int n) {
    if (n < 1) {
      return;
    }
    printNaturalNumbersUpToN(n - 1);
    System.out.println(n);
  }
}
