package fleetofthings;

public class MainFleetOfThings {

  public static void main(String[] args) {

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Fleet fleet = new Fleet();
    Thing thing01 = new Thing("Get milk");
    Thing thing02 = new Thing("Remove the obstacles");
    Thing thing03 = new Thing("Stand up");
    Thing thing04 = new Thing("Eat lunch");

    thing03.complete();
    thing04.complete();

    fleet.add(thing01);
    fleet.add(thing02);
    fleet.add(thing03);
    fleet.add(thing04);

    System.out.println(fleet);
  }
}
