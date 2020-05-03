import java.util.Scanner;

public class dude21 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int x = k.nextInt();
        if (x > 9 && x < 100) {
            System.out.println("NUM");
        } else if (x >= 0 && x < 10) {
            System.out.println("DIGIT");
        } else System.out.println("OTHER");
    }
}