public class ChangeElement {
    public static void main(String[] args){
        int[] s = {1, 2, 3, 8, 5, 6};
        s[3] = change(s[3]);
        System.out.println(s[3]);

    }
    public static int change(int a){
        a = 4;
        return a;
    }
}
