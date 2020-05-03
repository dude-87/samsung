import java.util.Scanner;

public class dude1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int k, b = 0;
        for (int i = 0; i < 3; i++) {
            k = (a % 10);
            a = (a / 10);
            b = (b + k);
        }
        System.out.println(b);
    }
}
