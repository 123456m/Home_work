package homework1.home01;

/**
 * Created by Mariana on 26.05.2016.
 */
import java.util.Scanner;
public class abc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a =sc.nextDouble();
        System.out.println("Enter b");
        double b =sc.nextDouble();
        System.out.println("Enter c");
        double c =sc.nextDouble();

                if (a * a == b*b + c*c) {
                    System.out.println("Rectangle");
                } else if (b * b == a *a + c * c) {
                    System.out.println("Rectangle");
                } else if (c * c == b *b + a * a) {
                    System.out.println("Rectangle");
                } else {
                    System.out.println("Not rectangle");
                }

    }
}
