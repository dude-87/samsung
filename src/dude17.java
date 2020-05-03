import java.util.Scanner;

public class dude17 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double x = k.nextDouble();
        System.out.println(-2 <= x && x <= 3 || 6 <= x && x <= 9 ? "false" : "true");
    }
}