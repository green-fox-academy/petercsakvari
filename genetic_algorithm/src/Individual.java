import java.util.Random;

public class Individual {

  private int fitness;
  private int[] character = new int[8];
  private int[] randomGoal;

  Individual(int[] randomGoal) {
    Random rand = new Random();
    for (int i = 0; i < character.length; i++) {
      character[i] = rand.nextInt(10);
    }
    fitness = 0;
    this.randomGoal = randomGoal;
  }

  public int[] getCharacter() {
    return character;
  }

  public int getFitness() {
    return fitness;
  }

  public void calculateFitness() {
    fitness = 0;
    for (int i = 0; i < 8; i++) {
      if (character[i] == randomGoal[i]) {
        fitness++;
      }
    }
  }

}