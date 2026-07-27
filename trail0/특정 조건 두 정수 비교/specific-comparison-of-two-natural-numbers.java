import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        double c = 0;
        double d = 0;
        if (A < B){
            c = 1;
        }
        if (A == B){
            d =  1;
        }

        System.out.printf("%.0f %.0f", c, d);
    }
}