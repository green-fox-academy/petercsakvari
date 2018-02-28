package counter;

//Create Counter class
//which has an integer field value
//when creating it should have a default value 0 or we can specify it when creating
//we can add(number) to this value another whole number
//or we can add() without parameters just increasing the value's value by one
//and we can get() the current value
//also we can reset() the value to the initial value

public class Counter {

  private int value = 0;
  private int initValue = 0;

  public Counter (int value) {
    this.value = value;
  }

  public void add (int number) {
    initValue += number;
    value += number;
  }

  public void add () {
    value++;
  }

  public int get () {
    return value;
  }

  public void reset () {
    value = initValue;
  }
}
