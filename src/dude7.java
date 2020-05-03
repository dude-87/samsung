import java.util.Scanner;

public class dude7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = 0;
        while (a > 0){
            b = (a % 10) + b;
            a = (a / 10);
        }
            System.out.println(b);
    }
}

















/*        for (int i = 0; i < 3; i++) {
            b = (a % 10) + b;
            a = (a / 10);
        }*/
