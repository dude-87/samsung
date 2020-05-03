import java.util.Scanner;

public class dude14 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int a = 2 * n;
        while (a == 2 * n) {
            a = n;
            n >>= 1;
        }
        System.out.println(n);
    }
}