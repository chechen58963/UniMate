import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();

            char c = sc.next().charAt(0);

            System.out.printf("%d\n", n*m);

            if(c == 'C')
                break;
        }
    }
}