import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A=0;

        char a1 = sc.next().charAt(0);
        int a2 = sc.nextInt();
        char b1 = sc.next().charAt(0);
        int b2 = sc.nextInt();
        char c1 = sc.next().charAt(0);
        int c2 = sc.nextInt();

        if (a1 == 'Y')
            if (a2 >= 37)
                A++;
        if (b1 == 'Y')
            if (b2 >= 37)
                A++;
        if (c1 == 'Y')
            if (c2 >= 37)
                A++;
        
        if (A >= 2)
            System.out.print("E");
        else
            System.out.print("N");    
    }
}