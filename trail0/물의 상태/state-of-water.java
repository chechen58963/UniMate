import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        if (c < 0){
            System.out.print("ice");
        }
        else if (c >= 100){
            System.out.print("vapor");
        }
        else{
            System.out.print("water");
        }
    }
}