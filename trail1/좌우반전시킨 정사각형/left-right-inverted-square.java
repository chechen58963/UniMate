import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 1;
        for(int i = n; i <= n*n;){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", i-(j*m));
            }
            m++;
            i += n;
            System.out.println();
        }
    }
}