import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum=0, mean=0;
        int cnt=0;
        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if(n >= 0 && n <= 200){
                sum += n;
                cnt++;
            }

        }
        mean = sum/cnt;
        System.out.printf("%.0f %.1f", sum, mean);
    }
}