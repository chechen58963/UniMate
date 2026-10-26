import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            int j = i % 10;
            int m = i / 10;
            if(i % 3 == 0)
                System.out.print("0 ");
            else if(j != 0 && j % 3 == 0)
                System.out.print("0 ");    
            else if(m != 0 && m % 3 == 0)
                System.out.print("0 ");  
            else
                System.out.printf("%d ", i);
        }
    }
}