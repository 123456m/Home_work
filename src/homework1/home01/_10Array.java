package homework1.home01;

/**
 * Created by Mariana on 6/4/2016.
 */
public class _10Array {
public static int[] splitArray(int[] arr, int start, int end) {

    int[] split = new int[end - start];

    for (int i = 0; i < split.length; i++) {
        split[i] = arr[start + i];
    }
    return split;
}