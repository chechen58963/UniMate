import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= 2*n - 1;){
            for(int j = 0; j < 2*n - 1;){
                System.out.printf("%d ", i+j+10);
                j += 2;
            }
            i += 2;
            System.out.println();
        }
    }
}