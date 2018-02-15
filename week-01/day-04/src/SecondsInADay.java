public class SecondsInADay {
    public static void main(String[] args){
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int secsInaDay = (24 * 60 * 60);
        int secsGone = ((currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds);
        int secsLeft = secsInaDay - secsGone;
        System.out.println(secsLeft);
    }
}
