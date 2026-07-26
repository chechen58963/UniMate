import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double C = (A + B);
        double D = (A + B) / 2;

        System.out.printf("%.0f %.1f", C, D);
    }
}