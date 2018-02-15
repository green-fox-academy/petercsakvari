public class task02 {
    public static void main(String[] args){

        String name = "Peter";
        int age = 23;
        double height = 1.70;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

        System.out.println("---------------");

        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22

        // Print the result of 13 substracted from 22

        // Print the result of 22 multiplied by 13

        // Print the result of 22 divided by 13 (as a decimal fraction)

        // Print the integer part of 22 divided by 13

        // Print the reminder of 22 divided by 13

        int var1 = 22;
        double var11 = (double) var1;

        int var2 = 13;
        double var22 = (double) var2;

        System.out.println(var2 + var1);
        System.out.println(var1 - var2);
        System.out.println(var1 * var2);

        System.out.println(var11 / var22);


        System.out.println(var1 / var2);
        System.out.println(var1 % var2);

        System.out.println("---------------");

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int hrs = 6;
        int sw = 17;
        int workdays = (sw * 5);

        System.out.println(workdays * hrs);

        int hrswk = 52;

        double asd = (hrswk / 7);
        double percc = (hrs / asd);

        System.out.println(percc * 100 + "%");
    }

}
