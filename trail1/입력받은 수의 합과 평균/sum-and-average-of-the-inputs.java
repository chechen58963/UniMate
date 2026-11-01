import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double sum=0, mean=0;
        int cnt=0;
        for(int i=0;i<a;i++){
            int n = sc.nextInt();
            sum += n;
        }
        mean = sum/a;
        System.out.printf("%.0f %.1f", sum, mean);
    }
}