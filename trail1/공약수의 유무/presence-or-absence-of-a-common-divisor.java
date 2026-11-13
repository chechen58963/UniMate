import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean S = false;

        for(; a <= b; a++){
            if(1920 % a == 0 && 2880 % a == 0)
                S = true;
        }
        if(S == true)
            System.out.print("1");
        else
            System.out.print("0");
    }
}