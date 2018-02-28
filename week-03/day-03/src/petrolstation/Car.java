package petrolstation;

public class Car {

  private static int gasAmount = 0;
  private static int capacity = 100;

  public static void setGasAmount(int gasAmount) {
    Car.gasAmount = gasAmount;
  }

  public static int getCapacity() {
    return capacity;
  }
}
