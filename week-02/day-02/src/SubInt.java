import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'

        int[] intArray = new int[]{1, 11, 34, 52, 61};
        int number = 1;
        System.out.println(subInt(number, intArray).toString());
    }

    private static ArrayList<Integer> subInt(int i, int[] ints) {
        ArrayList<Integer> subIntsOfNum = new ArrayList<>();
        ArrayList<Integer> subIntsOfNum2 = new ArrayList<>();
        String iString = ((String.valueOf(i)));
        for (int k = 0; k < ints.length; k++) {
            subIntsOfNum.add(ints[k]);
            String subSubString = subIntsOfNum.toString();
            if (subSubString.contains(iString)){
                subIntsOfNum2.add(k);
                subIntsOfNum.remove(0);
            }
        }
        return subIntsOfNum2;
    }
}


