public class Population {

  private Individual[] individuals = new Individual[50];
  private int fittest = 0;


  Population(int[] randomGoal) {
    for (int i = 0; i < individuals.length; i++) {
      individuals[i] = new Individual(randomGoal);
    }
  }

  public int getFittest() {
    return fittest;
  }

  public Individual[] getIndividuals() {
    return individuals;
  }

  public Individual getFittestIndividual() {
    int highestFit = 0;
    for (int i = 0; i < individuals.length; i++) {
      if (individuals[i].getFitness() > highestFit) {
        highestFit = i;
      }
    }
    fittest = individuals[highestFit].getFitness();
    return individuals[highestFit];
  }

  public Individual getSecondFittestIndividual() {
    int highestFit = 0;
    int secondHighestFit = 0;
    for (int i = 0; i < individuals.length; i++) {
      if (individuals[i].getFitness() > individuals[highestFit].getFitness()) {
        secondHighestFit = highestFit;
        highestFit = i;
      } else if (individuals[i].getFitness() > individuals[secondHighestFit].getFitness()) {
        secondHighestFit = i;
      }
    }
    return individuals[secondHighestFit];
  }

  public int getLeastFittestIndividualIndex() {
    int lowestFit = 0;
    for (int i = 0; i < individuals.length; i++) {
      if (individuals[i].getFitness() <= lowestFit) {
        lowestFit = i;
      }
    }
    return lowestFit;
  }

  public void calcIndividualFitness() {
    for (Individual individual : individuals) {
      individual.calculateFitness();
    }
    getFittestIndividual();
  }
}