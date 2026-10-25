import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (; a <= b;){
            System.out.printf("%d ", a);
            if (a % 2 != 0){
                a *= 2;
            }
            else if (a % 2 == 0){
                a += 3;
            }
        }
    }
}