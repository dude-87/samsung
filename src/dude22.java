import java.util.Scanner;

public class dude22 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int c = k.nextInt();
        if (a > b && b > c) System.out.println(c + " " + b + " " + a);
        else if (a > c && c > b) System.out.println(b + " " + c + " " + a);
        else if (b > a && a > c) System.out.println(c + " " + a + " " + b);
        else if (b > c && c > a) System.out.println(a + " " + c + " " + b);
        else if (c > a && a > b) System.out.println(b + " " + a + " " + c);
        else System.out.println(a + " " + b + " " + c);
    }
}