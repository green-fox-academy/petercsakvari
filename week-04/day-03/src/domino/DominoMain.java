package domino;

import java.util.*;

public class DominoMain {
  public static void main(String[] args) {

    //[[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]

    sortDominoes();


  }

  public static void sortDominoes() {

    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes);
    System.out.println(Arrays.asList(dominoes));
  }
}
