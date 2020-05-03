import java.util.Scanner;

public class dude19 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int x1 = k.nextInt(), x2 = k.nextInt(), x3 = k.nextInt(), x4 = k.nextInt();
        System.out.println(x1 + x2 == 0 || x2 + x3 == 0 || x3 + x4 == 0 || x1 + x3 == 0|| x2 + x4 == 0 || x1 + x4 == 0 ? "true": "false");
    }
}