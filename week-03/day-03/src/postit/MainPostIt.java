package postit;

//Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

import java.awt.*;

public class MainPostIt {

  public static void main(String[] args) {

    PostIt postIt1 = new PostIt(Color.orange, "Idea 1", Color.blue);
    PostIt postIt2 = new PostIt(Color.pink, "Awesome", Color.black);
    PostIt postIt3 = new PostIt(Color.yellow, "Superb!", Color.green);

  }

}
