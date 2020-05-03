import java.util.Scanner;

public class dude11 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int i = k.nextInt();
        int a = (int) Math.pow(2, i);
        n = n | a;
        System.out.println(n);
    }
}