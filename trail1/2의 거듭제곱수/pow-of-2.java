import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int a = 1;
            int sum=1;
            for(int j = 1; j <= i; j++){
                a *= 2;
            }
            if(a == n){
                System.out.print(i);
                break;
            }
        }
    }
}