package petrolstation;

//Create Station and Car classes

//        Station
//        gasAmount
//        refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount

//        Car
//        gasAmount
//        capacity
//        create constructor for Car where:
//        initialize gasAmount -> 0
//        initialize capacity -> 100

public class Station {

  private int gasAmount = 1000;

  public void refill () {
    gasAmount -= Car.getCapacity();
    Car.setGasAmount(gasAmount);
  }
}
