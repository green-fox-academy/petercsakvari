public class TakesLonger {
    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the String (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        int indexOfIt = quote.indexOf("It");
        int indexOfYou = quote.indexOf("you");
        String addedWords = quote.substring(indexOfIt, indexOfYou);
        addedWords = addedWords + "always takes longer than";
        quote = quote.replace("It", addedWords);

        System.out.println(quote);

    }
}
