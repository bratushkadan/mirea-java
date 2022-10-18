package a08;

public class T4 {
  public static void main(String[] args) {
    // 10k + вызовов уже не вывозит - ругается на превышение стековых вызовов
    System.out.println(sumOfNums(4, 13));
    System.out.println(sumOfNums(4, 1));
    System.out.println(sumOfNums(4, 17));
    System.out.println(sumOfNums(4, 25));
    System.out.println(sumOfNums(4, 0));
  }

  public static int sumOfNums(int k, int d) {
    return digitSum("9".repeat(k), k, d);
  }

  private static int digitSum(String digits, int k, int d) {
    if (digits.length() != k) {
      return 0;
    }

    int s = 0;
    for (int i = 0; i < k; i++) {
      s += Character.getNumericValue(digits.charAt(i));
    }

    if (s == d) {
      return 1 + digitSum(Integer.toString(Integer.parseInt(digits) - 1), k, d);
    }
    return digitSum(Integer.toString(Integer.parseInt(digits) - 1), k, d);
  }
}
