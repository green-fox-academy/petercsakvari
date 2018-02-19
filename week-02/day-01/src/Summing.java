public class Summing {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    public static void main (String[] args){
        int parameter = 5;
        System.out.println(sum(parameter));
    }

    public static int sum (int input){
        int sum = 0;
        for (int i = input; i > 0; i--) {
            sum += i;
        }
        return sum;
    }
}
