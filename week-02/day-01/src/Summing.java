public class Summing {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    public static void main (String[] args){
        int [] numbers = {1, 2, 3, 5, 9, 16};
        System.out.println(sum(numbers));
    }

    public static int sum (int[] inputArray){
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
        return sum;
    }
}
