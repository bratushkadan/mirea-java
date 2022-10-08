package a02.t04;

import java.util.ArrayList;
import java.util.Scanner;

public class RunShop {
  private static final Shop shop = new Shop();

  public static void main(String[] args) {
    System.out.println(
        "Приветствуем вас в компьютерном магазине!\nДобавьте названия товаров в магазин, разделяя каждое новой строкой.\nВведите \"0\", чтобы завершить добавление.");
    System.out.println(
        "Команды магазина:\n1 — добавить товар\n2 - удалить товар\n3 - найти товар по артикулу\n0 - завершить работу магазина");
    RunShop.prompt();
    System.out.println("До свидания!");
  }

  private static void addProduct(String article) {
    boolean success = RunShop.shop.addComputer(article);
    if (success) {
      System.out.format("%s добавлен в магазин!\n", article);
    } else {
      System.out.format("%s уже есть в магазине!\n", article);
    }
  }

  private static void removeProduct(String article) {
    boolean success = RunShop.shop.removeComputer(article);
    if (success) {
      System.out.format("%s удален из магазина!\n", article);
    } else {
      System.out.format("%s не был удален, так как его и нет в магазине!\n", article);
    }
  }

  private static void findProduct(String article) {
    ArrayList<String> list = RunShop.shop.searchComputer(article);
    if (article.equals("")) {
      System.out.format("Все компьютеры: %s\n", list.toString());
    } else {
      System.out.format("Результат поиска товара в магазине по артикулу \"%s\": %s\n", article, list.toString());
    }
  }

  private static void prompt() {
    Scanner scanner = new Scanner(System.in);

    String in = "";
    while (in != "0") {
      in = scanner.nextLine();
      if (in.equals("0")) {
        break;
      }
      if (in.equals("1")) {
        System.out.print("Введите имя добавляемого продукта: ");
        RunShop.addProduct(scanner.nextLine());
        continue;
      }
      if (in.equals("2")) {
        System.out.print("Введите имя удаляемого продукта: ");
        RunShop.removeProduct(scanner.nextLine());
        continue;
      }
      if (in.equals("3")) {
        System.out.print("Какой продукт нужно найти?: ");
        RunShop.findProduct(scanner.nextLine());
        continue;
      }
      System.out.println("Неправильный ввод");
    }

    scanner.close();
  }
}
