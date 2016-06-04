package homework1.home01;

/**
 * Created by Mariana on 6/4/2016.
 */
public class _08Array {
    public static int[] generateMasEvenRandomOnEvenIndex(int size, int range) {

        int[] mas = new int[size];
        int random = 0;

        for (int i = 0; i < mas.length; i++) {
            random = (int) (Math.random() * range);
            if (i == 0 || i %2 == 0) {

                // todo use ternary operator
                if (random %2 == 0) {
                    mas[i] = random;
                } else {
                    mas[i] = random + 1;
                }

            } else {

                //todo use ternary operator
                if (random %2 != 0) {
                    mas[i] = random;
                } else {
                    mas[i] = random + 1;
                }
            }
        }
        return mas;
    }
}
