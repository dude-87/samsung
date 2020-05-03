import java.util.Scanner;

public class dude13 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int i = k.nextInt();
        int a = (1 << i) - 1;
        n = n & a;
        System.out.println(n);
    }
}