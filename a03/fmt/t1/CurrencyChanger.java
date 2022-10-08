package a03.fmt.t1;

import java.util.HashMap;

class CurrencyChanger {
  private static final String mainCurrency = "usd";

  private HashMap<String, Double> rates = new HashMap<>();

  public CurrencyChanger() {
    this.updateRatesInfo();
  }

  public final double exchange(String from, String to, double amount) throws Exception {
    if (from.equals(to)) {
      throw new Exception("Can't exchange the same currency!");
    }

    if (!this.rates.containsKey(from)) {
      throw new Exception(String.format("Can't exchange currency '%s' yet.", from));
    }

    if (!this.rates.containsKey(to)) {
      throw new Exception(String.format("Can't exchange currency '%s' yet.", to));
    }

    if (from == CurrencyChanger.mainCurrency) {
      return amount * this.rates.get(to);
    }

    if (to == CurrencyChanger.mainCurrency) {
      return amount / this.rates.get(from);
    }

    // not main to not main
    return amount / this.rates.get(from) * this.rates.get(to);
  }

  private final void updateRatesInfo() {
    this.rates.put("rub", 59.13);
    this.rates.put("jpy", 145.35);
    this.rates.put("krw", 1424.81);
    this.rates.put("cny", 7.12);
    this.rates.put("eur", 1.03);
    this.rates.put("gbp", 0.9);
  }
}
