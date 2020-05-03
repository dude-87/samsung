import java.util.Scanner;

public class dude9 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int i = k.nextInt();
        a >>= i;
        a <<= i;
        System.out.println(a);
    }
}