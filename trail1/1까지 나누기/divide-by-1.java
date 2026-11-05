import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = N;
        for(int i = 1; i <= M; i++){
            N /= i;
            if(N <= 1){
                System.out.print(i);
                break;
            }
            
        }
    }
}