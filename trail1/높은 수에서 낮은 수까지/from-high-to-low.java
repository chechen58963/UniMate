import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b){
            for(;a >= b; a--)
                System.out.printf("%d ", a);
        }
        else{
            for(; a <= b; b--)
                System.out.printf("%d ", b);
        }
    }
}