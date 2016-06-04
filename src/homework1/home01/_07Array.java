package homework1.home01;

/**
 * Created by Mariana on 6/4/2016.
 */
public class _07Array {
    public static void summArr1Arr2(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
            System.out.print(arr3[i] + " ");
        }

    }
}
