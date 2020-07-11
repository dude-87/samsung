import java.util.Scanner;

public class dude32 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N = k.nextInt();
        int i = 1;
        while (N > 10) {
            N = N/10;
            i++;
        }
        System.out.println(i);
    }
}
