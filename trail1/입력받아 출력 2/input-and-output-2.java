import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String[] strArr = S.split("-");

        System.out.printf(strArr[0] + strArr[1]); 
    }
}