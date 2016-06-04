package homework1;

import java.util.Scanner;

/**
 * Created by Mariana on 6/2/2016.
 */
public class ArrayUtils {
    public static int [] MinMaxArray (int size){

        int[] array = new int[10];
        int min;
        int max;
        for (int i = 0; i != 10; i++) {

            Scanner sc = sc () Console.WriteLine("{0}", i);
            array[i] = Convert.ToInt32(Console.ReadLine());
        }
        max = array[0];
        min = array[0];
        for (int i = 1; i != 10; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        System.out.println("Max: {0}", max);
        System.out.println("Min: {0}", min);
        }
    }

}
