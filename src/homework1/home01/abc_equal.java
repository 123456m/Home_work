package homework1.home01;

import java.util.Scanner;

/**
 * Created by Mariana on 27.05.2016.
 */
public class abc_equal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a");
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        int nch1 = Integer.parseInt(n1);
        int nch2 = Integer.parseInt(n2);
        int nch3 = Integer.parseInt(n3);
        if (nch1 == nch2) {
            System.out.println(nch1 + " " + nch2);
        }
        else if (nch2 == nch3) {
            System.out.println(nch2 + " " + nch3);
        }
        else if (nch3 == nch1) {
            System.out.println(nch3 + " " + nch1);
        }
        else if (nch2 == nch1 == nch3)
        {
            System.out.println(nch1 + " " + nch2 + " " + nch3);
        }
        else {
            System.out.println(" ");
    }
}
