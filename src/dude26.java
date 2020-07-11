import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class dude26 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int i = 1;
        int a = k.nextInt();
        while (a >= 0) {
            a = k.nextInt();
            i++;
        }
        out.println(i);
    }
}
