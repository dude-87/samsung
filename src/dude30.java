import java.util.Scanner;

public class dude30 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int i = 1;
        while (a > 1) {
            a = a / 2;
            i++;
        }
        System.out.println(i);
    }
}
