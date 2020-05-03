import java.util.Scanner;

public class dude5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int m = a % 10;
        if (a > 0) {
            if (a % 10 > m) {
                m = a % 10;
            }
            a /= 10;
        }
        System.out.println(m);
    }
}