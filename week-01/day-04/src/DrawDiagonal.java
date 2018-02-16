import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args){
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        System.out.println("Please write a number: ");

        Scanner scanner = new Scanner(System.in);
        int nmbr = scanner.nextInt();

        while (nmbr > 0){
                System.out.println("%%%%%");
                nmbr -= 1;

            if (nmbr > 0){
                System.out.println("%%  %");
                nmbr -= 1;
            } else return;

            if (nmbr > 0){
                System.out.println("% % %");
                nmbr -= 1;
            } else return;

            if (nmbr > 0){
                System.out.println("%  %%");
                nmbr -= 1;
            } else return;
        }
    }
}

