import java.util.Scanner;

public class dude23 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = a;
        a = a % 100;
        if (a > 20) a = a % 10;
        switch (a) {
            case (1):
                System.out.println(b + " TOPT");
                break;
            case (2):
            case (3):
            case (4):
                System.out.println(b + " TOPTA");
                break;
            default:
                System.out.println(b + " TOPTOB");
        }
    }
}
