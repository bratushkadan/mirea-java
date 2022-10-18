package a04_1;

public class T10 {
  public static void main(String[] args) {
    Transport[] arr = {
        new Automobile(50, 200, 200, 500),
        new Plane(50, 200, 200, 500),
        new Train(50, 200, 200, 500),
        new Ship(50, 200, 200, 500),
    };

    for (Transport t : arr) {
      String label = getLabel(t);
      System.out.format("%s: перевозка 50 пассажиров на 1000км стоит %d\n", label, t.calculatePassengerTransportationCost(1000, 50));
      System.out.format("%s: перевозка 5 тонн груза на 1000км стоит %d\n", label, t.calculateCargoTransportationCost(1000, 5000));
      System.out.println();
    }
  }

  public static String getLabel(Transport t) {
    if (t instanceof Automobile) {
      return "Автомобиль";
    }
    if (t instanceof Plane) {
      return "Самолет";
    }
    if (t instanceof Train) {
      return "Поезд";
    }
    if (t instanceof Ship) {
      return "Корабль";
    }
    return "Транспорт";
  }
}

abstract class Transport {
  protected int cargoTransportationCost;
  protected int cargoTransportationFine = 0;
  protected int passengerTransportationCost;
  protected int passengerTransportationFine = 0;

  public Transport(int cargoTransportationCost, int passengerTransportationCost, int cargoTransportationFine,
      int passengerTransportationFine) {
    this.cargoTransportationCost = cargoTransportationCost;
    this.passengerTransportationCost = passengerTransportationCost;
    this.cargoTransportationFine = cargoTransportationFine;
    this.passengerTransportationFine = passengerTransportationFine;
  }

  abstract public int calculateCargoTransportationCost(int distance, int kgWeight);

  abstract public int calculatePassengerTransportationCost(int distance, int passengers);
}

class Automobile extends Transport {
  public Automobile(int cargoTransportationCost, int passengerTransportationCost, int cargoTransportationFine,
      int passengerTransportationFine) {
    super(cargoTransportationCost, passengerTransportationCost, cargoTransportationFine, passengerTransportationFine);
  }

  public int calculateCargoTransportationCost(int distance, int kgWeight) {
    return 3 * kgWeight * cargoTransportationCost + cargoTransportationFine / 2 + 25 * distance;
  }

  public int calculatePassengerTransportationCost(int distance, int passengers) {
    return 15 * passengers * passengerTransportationCost + 3 * passengerTransportationFine + 25 * distance;
  }
}

class Plane extends Transport {
  public Plane(int cargoTransportationCost, int passengerTransportationCost, int cargoTransportationFine,
      int passengerTransportationFine) {
    super(cargoTransportationCost, passengerTransportationCost, cargoTransportationFine, passengerTransportationFine);
  }

  public int calculateCargoTransportationCost(int distance, int kgWeight) {
    return 29 * kgWeight * cargoTransportationCost + cargoTransportationFine / 2 + 10 * distance;
  }

  public int calculatePassengerTransportationCost(int distance, int passengers) {
    return 40 * passengers * passengerTransportationCost + passengerTransportationFine + 10 * distance;
  }
}

class Train extends Transport {
  public Train(int cargoTransportationCost, int passengerTransportationCost, int cargoTransportationFine,
      int passengerTransportationFine) {
    super(cargoTransportationCost, passengerTransportationCost, cargoTransportationFine, passengerTransportationFine);
  }

  public int calculateCargoTransportationCost(int distance, int kgWeight) {
    return (kgWeight * cargoTransportationCost) / 2 + cargoTransportationFine / 5 + 5 * distance;
  }

  public int calculatePassengerTransportationCost(int distance, int passengers) {
    return passengers * passengerTransportationCost + passengerTransportationFine / 10 + 5 * distance;
  }
}

class Ship extends Transport {
  public Ship(int cargoTransportationCost, int passengerTransportationCost, int cargoTransportationFine,
      int passengerTransportationFine) {
    super(cargoTransportationCost, passengerTransportationCost, cargoTransportationFine, passengerTransportationFine);
  }

  public int calculateCargoTransportationCost(int distance, int kgWeight) {
    return (kgWeight * cargoTransportationCost) / 5 + cargoTransportationFine / 2 + 15 * distance;
  }

  public int calculatePassengerTransportationCost(int distance, int passengers) {
    return passengers * passengerTransportationCost + passengerTransportationFine / 3 + 15 * distance;
  }
}
