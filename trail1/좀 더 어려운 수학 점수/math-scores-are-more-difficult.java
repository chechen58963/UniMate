import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        if (a1 > b1)
            System.out.print("A");
        else if (a1 == b1){
            if (a2 > b2)
                System.out.print("A");
            else
                System.out.print("B");
        }
        else
            System.out.print("B"); 
        
    }
}