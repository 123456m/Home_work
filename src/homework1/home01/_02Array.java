package homework1.home01;

/**
 * Created by Mariana on 6/3/2016.
 */
public class _02Array {
    int[] numbers = {5, 8, 12, -18, -54, 84, -35, 17, 37};

    double average = 0;
    if (numbers.length > 0)
    {
        double sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }
        average = sum / numbers.length;
    }


}
