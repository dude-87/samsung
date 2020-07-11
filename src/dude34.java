import java.util.Scanner;

public class dude34 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = 10;
        while (a > 0) {
            if (b >= (a % 10) && (a % 10 != 0)) {
                b = a % 10;
            }
            a = a / 10;
        }
        System.out.println(b);
    }
}