import java.util.Scanner;

public class dude31 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N = k.nextInt();
        int a = 26;
        int i = 0;
        while (a <= N) {
            i = i + a;
            a = a + 2;
        }
        System.out.println(i);
    }
}
