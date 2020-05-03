import java.util.Scanner;

public class dude16 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double x = k.nextDouble();
        System.out.println(-3 <= x && x <= 5 || 9 <= x && x <= 15 ? "true" : "false");
    }
}