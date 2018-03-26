import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
  public static void main(String[] args) {
//    Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes, it's up to you how you
//    name/create them! Write a Stream Expression to find the foxes with green color! Write a Stream Expression to find
//    the foxes with green color and pallida type!
    List<Fox> foxList = new ArrayList<>();
    foxList.add(new Fox("Bob", "Corsac", "green"));
    foxList.add(new Fox("John", "Pallida", "green"));
    foxList.add(new Fox("James", "Pallida", "blue"));
    foxList.add(new Fox("Matt", "Macrotis", "green"));
    foxList.add(new Fox("Michael", "Macrotis", "red"));

    foxList.stream()
            .filter(fox -> fox.getColor().equals("green"))
            .map(fox -> fox.getName() + " ")
            .forEach(System.out::print);

    System.out.println();

    foxList.stream()
            .filter(fox -> fox.getColor().toLowerCase().equals("green") && fox.getType().toLowerCase().equals("pallida"))
            .map(fox -> fox.getName() + " ")
            .forEach(System.out::print);
  }

}
class Fox {
  private String name;
  private String type;
  private String color;

  Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getColor() {
    return color;
  }
}
