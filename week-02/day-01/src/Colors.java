import java.util.Arrays;

public class Colors {
    // - Create a two dimensional array
    //   which can contain the different shades of specified colors
    // - In `colors[0]` store the shades of green:
    //   `"lime", "forest green", "olive", "pale green", "spring green"`
    // - In `colors[1]` store the shades of red:
    //   `"orange red", "red", "tomato"`
    // - In `colors[2]` store the shades of pink:
    //   `"orchid", "violet", "pink", "hot pink"`
    public static void main(String[] args) {

        String[][] colors =
                {

                        {"lime", "forest green", "olive", "pale green", "spring green"},
                        {"orange red", "red", "tomato"},
                        {"orchid", "violet", "pink", "hot pink"}

                };


        for (int row = 0; row < colors.length; row++) {
            for (int column = 0; column < colors[row].length; column++) {
                System.out.print(colors[row][column] + " | ");
            }
            System.out.println();

        }
    }
}
