import java.util.Scanner;

public class dude20 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int x1 = k.nextInt(), x2 = k.nextInt(), x3 = k.nextInt();
        boolean b1 = x1 % 2 == 0;
        boolean b2 = x2 % 2 == 0;
        boolean b3 = x3 % 2 == 0;
        System.out.println((b1 && b2) || (b1 && b3) || (b2 && b3) ? "true" : "false");
    }
}