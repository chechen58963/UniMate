import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int n =3;
        while(n <=i){
            System.out.printf("%d ", n);
            n += 3;
        }
    }
}