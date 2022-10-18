package a04_1;

public class T6JobPersons {
  public static void main(String[] args) {
    // б)
    Employee man = new Manager("a", "b", 100, 3, 64);

    // г)
    Employee[] employees = {new Manager("a", "b", 100, 3, 64), new Employee("c" , "d", 100, 3)};
    for (Employee e : employees) {
      System.out.format("Income: %d\n", e.getIncome());
    }
    /* 
     * Income: 364
       Income: 300
     */
  }
}

class Employee {
  protected String firstName;
  protected String lastName;
  protected long income;
  protected long workedDays = 0;

  public Employee(String f, String l, long inc, long wDays) {
    firstName = f;
    lastName = l;
    income = inc;
    workedDays = wDays;
  } 

  public long getIncome() {
    if (workedDays > 0) {
      return workedDays * income;
    }
    return income;
  }
}

class Manager extends Employee {
  protected long avgSum = 0;

  public Manager(String f, String l, long inc, long wDays, long avgSum) {
    super(f, l, inc, wDays);
    this.avgSum = avgSum;
  }

  @Override
  public long getIncome() {
    if (workedDays > 0) {
      return workedDays * income + avgSum;
    }
    return income + avgSum;
  }
}