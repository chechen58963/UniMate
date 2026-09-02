public class Main {
    public static void main(String[] args) {
        int a=5, b=6, c=7;
        int temp1=0, temp2=0;

        temp1 = a;
        temp2 = b;
        b = temp1;
        a = c;
        c = temp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}