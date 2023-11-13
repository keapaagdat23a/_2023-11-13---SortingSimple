package demo.carssortedbyplate.sortdemo1;

public class Car implements Comparable<Car> {
  private String brand;
  private int year;
  private String color;
  private double price;
  private boolean isEv;

  public Car(String brand, int year, String color, double price, boolean isEv) {
    this.brand = brand;
    this.year = year;
    this.color = color;
    this.price = price;
    this.isEv = isEv;
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", year=" + year +
        ", color='" + color + '\'' +
        ", price=" + price +
        ", isEv=" + isEv +
        '}';
  }


  @Override
  public int compareTo(Car otherCar) {
    return otherCar.year - this.year;
  }
}
