package homework1.home01;

import java.util.Scanner;

/**
 * Created by Mariana on 27.05.2016.
 */
public class Speed {
    public static void main(String[] arg) {
        int speedMeterPerSecond = 3;
        int speedKilomPerHour = 120;


        boolean isKilometersBigger = (speedKilomPerHour / 3.6) > speedMeterPerSecond;
        if (isKilometersBigger){
            System.out.println("Speed in kilometers per hour is higher");

        } else if ((speedKilomPerHour / 3.6) < speedMeterPerSecond){
                System.out.println("Speed in meters per seconds is higher");
        } else {
            System.out.println("Speeds are equal");
        }
}
}