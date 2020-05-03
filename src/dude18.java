import java.util.Scanner;

public class dude18 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int x = k.nextInt();
        System.out.println(x >= 100 && x % 5 == 0 && x < 1000 ? "true" : "false");
    }
}