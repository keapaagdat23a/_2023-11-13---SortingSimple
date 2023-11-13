package demo.carssortedbyplate.sortdemo1;

import java.util.ArrayList;
import java.util.Collections;

public class Garage {
  private ArrayList<Car> cars;

  public static void main(String[] args) {
    new Garage().run();
  }

  private void run() {
    cars = new ArrayList<>();
    cars.add(new Car("Subaru", 2015, "Blue", 67000, true));
    cars.add(new Car("Kia", 2018, "Red", 36000, true));
    cars.add(new Car("Mazda", 2011, "Silver", 89000, false));
    cars.add(new Car("Chevrolet", 2014, "Black", 52000, false));
    cars.add(new Car("Fiat", 2009, "White", 110000, false));
    cars.add(new Car("Peugeot", 2016, "Green", 45000, true));
    cars.add(new Car("Opel", 2013, "Grey", 60000, false));
    cars.add(new Car("Citroen", 2012, "Yellow", 72000, false));
    cars.add(new Car("Dacia", 2017, "Orange", 38000, true));
    cars.add(new Car("Suzuki", 2010, "Brown", 80000, false));
    cars.add(new Car("Lada", 2005, "Purple", 120000, false));
    cars.add(new Car("Smart", 2019, "Pink", 28000, true));
    cars.add(new Car("Chrysler", 2008, "Gold", 95000, false));
    cars.add(new Car("Jaguar", 2014, "Cyan", 54000, true));
    cars.add(new Car("Lamborghini", 2020, "Lime", 18000, true));
    cars.add(new Car("Bugatti", 2016, "Teal", 47000, true));
    cars.add(new Car("Ferrari", 2015, "Magenta", 59000, true));
    cars.add(new Car("Porsche", 2017, "Turquoise", 42000, true));
    cars.add(new Car("Bentley", 2018, "Maroon", 34000, true));
    cars.add(new Car("Rolls-Royce", 2021, "Beige", 12000, true));
    cars.add(new Car("McLaren", 2019, "Violet", 25000, true));
    cars.add(new Car("Aston Martin", 2019, "Indigo", 26000, true));
    cars.add(new Car("Lotus", 2014, "Crimson", 56000, true));
    cars.add(new Car("Mini", 2016, "Olive", 48000, true));
    cars.add(new Car("Tesla", 2022, "Plum", 5000, true));

    for (Car c: cars) {
      System.out.println(c);
    }

    Collections.sort(cars);
    System.out.println("-------------------------");

    for (Car c: cars) {
      System.out.println(c);
    }
  }
}
