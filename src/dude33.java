import java.util.Scanner;

public class dude33 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = 10;
        while (a > 0) {
            if (((a % 10) % 2) != 0) {
                if (b >= (a % 10)) {
                    b = a % 10;
                }
            }
            a = a / 10;
        }
        if (a == 0 && b == 10) {
            System.out.println("NO");
        } else {
            System.out.println(b);
        }
    }
}
