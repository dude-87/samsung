import java.util.Scanner;

public class dude28 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = 0;
        while ((a / 10 >= 1) && (a / 10 < 10)) {
            b = b + (a / 10) + (a % 10);
            a = k.nextInt();
        }
        System.out.println(b);
    }
}
