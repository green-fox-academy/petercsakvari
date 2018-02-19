import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String input1 = sc.nextLine();

        System.out.println("Enter another word: ");
        String input2 = sc.nextLine();

        System.out.println(isAnagram(input1, input2));
    }
    public static boolean isAnagram (String in1, String in2){
        if (in1.length() == in2.length()){
            char[] word1 = in1.toCharArray();
            char[] word2 = in2.toCharArray();
            Arrays.sort(word1);
            Arrays.sort(word2);
            return Arrays.equals(word1, word2);
        } else return false;
    }
}
