import java.util.Arrays;

public class AppendA {
    // - Create an array variable named `nimals`
    //   with the following content: `["kuty", "macsk", "cic"]`
    // - Add all elements an `"a"` at the end
    public static void main(String[] args){

        String[] nimals = {"kuty", "macsk", "cic"};
        System.out.println(Arrays.toString(appendA(nimals)));

    }
    public static String[] appendA (String[] input){
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i] + "a";
        }
        return input;
    }
}
