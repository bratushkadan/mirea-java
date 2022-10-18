package a04_1;

public class T2Phone {
  private String phoneNumber;
  private String model;
  private double weight;

  public T2Phone(String num, String mod, double w) {
    this(num, mod);
    this.weight = w;
  }
  public T2Phone(String num, String mod) {
    this.phoneNumber = num;
    this.model = mod;
  }
  public T2Phone() {}

  public void receiveCall(String from) {
    System.out.format("Звонит %s\n", from);
  }
  public void receiveCall(String from, String num) {
    System.out.format("Звонит %s: %s\n", from, num);
  }
  public void sendMessages(String... to) {
    for (String num : to) {
      System.out.println(num);
    }
  }

  public String getNumber() {
    return phoneNumber;
  }
}
