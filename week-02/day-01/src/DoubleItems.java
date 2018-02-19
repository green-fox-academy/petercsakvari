import java.util.Arrays;

public class DoubleItems {
    // - Create an array variable named `ag`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array
    public static void main(String[] args){

        int [] ag = {3, 4, 5, 6, 7};

        doubler(ag);

        System.out.println(Arrays.toString(ag));
    }
    public static void doubler (int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
}
