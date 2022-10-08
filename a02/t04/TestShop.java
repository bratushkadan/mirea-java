package a02.t04;

public class TestShop {
  public static void main(String[] args) {
    Shop shop = new Shop();

    assert shop.addComputer("macbook pro 2020");
    assert !shop.addComputer("macbook pro 2020");

    assert !shop.removeComputer("lenovo e340");
    assert !shop.removeComputer("dell probook");
    assert shop.removeComputer("macbook pro 2020");

    assert shop.addComputer("macbook pro 2021 M1");
    assert shop.addComputer("macbook pro late 2021 M1 Pro");
    assert shop.addComputer("macbook pro 2020");
    assert shop.addComputer("macbook pro 2019 i5 8GB SSD 128");
    assert shop.addComputer("mac mid 2017");
    assert shop.addComputer("lenovo e340");
    assert shop.addComputer("lenovo d225");
    assert shop.addComputer("macbook pro 2022 M2");
    assert shop.addComputer("dell Duo");
    assert shop.addComputer("dell Erat");
    assert shop.addComputer("google laptop");
    assert shop.addComputer("dell Dolore");
    assert shop.addComputer("dell Eos");
    assert shop.addComputer("dell Eos 2");
    
    assert shop.searchComputer("dell Eos").size() == 2;
    assert shop.searchComputer("macbook").size() == 5;
    assert shop.searchComputer("mac").size() == 6;
    assert shop.searchComputer("lenovo").size() == 2;
    assert shop.searchComputer("dell").size() == 5;
  }
}
