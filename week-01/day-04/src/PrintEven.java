public class PrintEven {
    public static void main(String[] args){
        // Create a program that prints all the even numbers between 0 and 500

        for (int number = 0; number <= 500; number++) {
            if ((number % 2) == 0) {
                System.out.println(number);
            }
        }
    }
}
