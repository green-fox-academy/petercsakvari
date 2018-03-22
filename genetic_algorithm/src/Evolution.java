import java.util.Random;

public class Evolution {

  private int populationGeneration = 0;
  private Random rand = new Random();
  private int[] randomGoal = new int[8];
  private Population population = new Population(randomGoal);
  private Individual fittest = new Individual(randomGoal);
  private Individual secondFittest = new Individual(randomGoal);

  public void start() {
    for (int i = 0; i < randomGoal.length; i++) {
      randomGoal[i] = rand.nextInt(10);
    }

    population.calcIndividualFitness();
    System.out.println();
    System.out.println("Generation: " + populationGeneration + " || Fittest: " + population.getFittest());

    while (population.getFittest() < 8) {
      populationGeneration++;
      selection();
      crossover();
      mutation();
      population.calcIndividualFitness();
      addFittestChild();
      System.out.println("Generation: " + populationGeneration + " || Fittest: " + population.getFittest());
      if (populationGeneration == 500) {
        System.err.println("Cant generate it in 500 generations :(");
        System.exit(0);
      }
    }

    System.out.print("Random number to generate: ");
    for (int number : randomGoal) {
      System.out.print(number);
    }
    System.out.println();
    System.out.print("GOT THIS: ");
    for (int i = 0; i < fittest.getCharacter().length; i++) {
      System.out.print(fittest.getCharacter()[i]);
    }
  }

  private void selection() {
    fittest = population.getFittestIndividual();
    secondFittest = population.getSecondFittestIndividual();
  }

  private void crossover() {
    int crossoverPoint = rand.nextInt(9);
    for (int i = 0; i < crossoverPoint; i++) {
      int temp = fittest.getCharacter()[i];
      fittest.getCharacter()[i] = secondFittest.getCharacter()[i];
      secondFittest.getCharacter()[i] = temp;
    }
  }

  private void mutation() {
    int mutationPoint = rand.nextInt(8);
    if (fittest.getCharacter()[mutationPoint] != randomGoal[mutationPoint]) {
      fittest.getCharacter()[mutationPoint] = rand.nextInt(10);
    }
    mutationPoint = rand.nextInt(8);
    if (secondFittest.getCharacter()[mutationPoint] != randomGoal[mutationPoint]) {
      secondFittest.getCharacter()[mutationPoint] = rand.nextInt(10);
    }
  }

  private Individual getFittestChild() {
    if (fittest.getFitness() > secondFittest.getFitness()) {
      return fittest;
    }
    return secondFittest;
  }

  private void addFittestChild() {
    fittest.calculateFitness();
    secondFittest.calculateFitness();

    int indexToReplace = population.getLeastFittestIndividualIndex();
    population.getIndividuals()[indexToReplace] = getFittestChild();
  }
}
