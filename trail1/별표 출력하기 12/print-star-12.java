import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int j = 0; j < n; j++){
            System.out.print("* ");
        }
        System.out.println();
        int m = 2;
        int k = n/2;
        for(int i = 1; i < n; i++){
            if(i%2==0)
                k--;
            if(i > 1 && i %2 == 0)
                m += 4;
            for(int j = 0; j < m; j++)
                System.out.print(" ");
            for(int j = 0; j < k; j++)
                System.out.print("*   ");
            System.out.println();
        }
    }
}