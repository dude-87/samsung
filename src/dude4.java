import java.util.Scanner;

public class dude4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        a %= 86400;
        int h = (a / 3600), m = ((a % 3600) / 60), s = (a % 60);
        if (m < 10) {
            if (s < 10) {
                System.out.println(h + ":0" + m + ":0" + s);
            } else
                System.out.println(h + ":0" + m + ":" + s);
        }
        if (m >= 10) {
            if (s < 10) {
                System.out.println(h + ":" + m + ":0" + s);
            } else
                System.out.println(h + ":" + m + ":" + s);
        }
    }
}