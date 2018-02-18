public class IncrementElement {
    public static void main(String[] args){
        int [] t = {1, 2, 3, 4, 5};
        System.out.println(inc(t[2]));
    }
    public static int inc (int a){
        a = ++a;
        return a;
    }
}
