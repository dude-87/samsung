import java.util.Scanner;

public class dude2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        a -= a % 2;
        a += 2;
        System.out.println(a);
    }
}
