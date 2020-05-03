import java.util.Scanner;

public class dude24 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double a = k.nextDouble();
        double b = k.nextDouble();
        double c = (double)Math.round((b / -a)*10) /10;
        if (a <= 0 && b <= 0)
            System.out.println("no such x");
        else if (a >= 0 && b > 0)
        System.out.println("any x");
        else if (a < 0 || b < 0)
            if (a < 0)
                System.out.println(-c + "<x<" + c);
            else System.out.println("x<" + -c + " or " + "x>" + c);
    }
}