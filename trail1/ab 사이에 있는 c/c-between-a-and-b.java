import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean S = false;

        for(; a <= b; a++){
            if(a % c == 0)
                S = true;
            
        }
        if (S == true)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}