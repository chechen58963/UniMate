import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        if(A >= B ){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        if(A > B ){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        if(A <= B ){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        if(A < B ){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        if (A == B ){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        if(A != B ){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}