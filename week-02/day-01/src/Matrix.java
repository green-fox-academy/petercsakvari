public class Matrix {
    public static void main(String[] args) {
        int[][] multiArray = new int[4][4];
        display(multiArray);
    }

    public static void display(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}

