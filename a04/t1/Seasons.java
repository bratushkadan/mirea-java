package a04.t1;

public class Seasons {
  public static void main(String[] args) {
    Season season = Season.SUMMER;

    // 1.
    System.out.println(season);
    System.out.println();

    // 2.
    Season.printFavourite(Season.AUTUMN);
    System.out.println();

    // 3.
    System.out.format("Average temp during %s is %d degrees\n", Season.AUTUMN, Season.AUTUMN.getAvgtemp());
    System.out.println();

    // 5.
    System.out.println(Season.AUTUMN.getDescription());
    System.out.println(Season.WINTER.getDescription());
    System.out.println(Season.SPRING.getDescription());
    System.out.println(Season.SUMMER.getDescription());
    System.out.println();

    // 6.
    for (Season s : Season.values()) {
      System.out.format("%s, средняя температура: %d градус(ов) | %s\n", s, s.getAvgtemp(), s.getDescription());
    }
  }
}
