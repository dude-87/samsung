import java.util.Scanner;

public class dude29 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int i = 0;
        while (a >= b) {
            a = a - b;
            i++;
        }
        System.out.println(i + " " + a);
    }
}
