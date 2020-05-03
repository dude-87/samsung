import java.util.Scanner;

public class dude3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int n = k.nextInt();
        int c;
        a = a * n + (b * n / 100);
        b = b * n % 100;
        System.out.println(a+" "+b);
    }
}
