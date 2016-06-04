package homework1.home01;
import java.util.Arrays;
/**
 * Created by Mariana on 6/3/2016.
 */
public class _03Array {
    public static void main(String[] args)
    {
        double[] values = generateData(10);
        System.out.println("Original array: " + Arrays.toString(values));
        int min = findMinElseMaxPosition(values, true);
        int max = findMinElseMaxPosition(values, false);
        System.out.println("MIN=" + values[min] + " MAX=" + values[max]);
        revertArrayElements(min, max, values);
        System.out.println("Final array: " + Arrays.toString(values));
    }

    private static double[] generateData(int size)
    {
        double[] data = new double[size];
        for (int i = 0; i < data.length; i++)
        {
            data[i] = Math.round(((Math.random() - 0.5) * 200) * 100) / 100.0d;
        }
        return data;
    }

    private static int findMinElseMaxPosition(double[] values,
                                              boolean findMin)
    {
        int index = 0;
        double value = values[index];
        for (int i = 1; i < values.length; i++)
        {
            if (findMin ? values[i] < value : values[i] > value)
            {
                value = values[i];
                index = i;
            }
        }
        return index;
    }

    private static void revertArrayElements(int src,
                                            int dest,
                                            double[] values)
    {
        double temp = values[dest];
        values[dest] = values[src];
        values[src] = temp;
    }
}

