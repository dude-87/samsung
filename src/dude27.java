import java.util.Scanner;

public class dude27 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = 0;
        while (a % 5 != 0) {
            if (a > 10) {
                b = b + a;
            }
            a = k.nextInt();
        }
        if (a > 10) {
            b = b + a;
        }
        System.out.println(b);
    }
}
