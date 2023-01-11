package task1;

import java.util.Arrays;

/**
 * Дан массив целых цифр и ещё одно целое число. Удалите все вхождения этого
 * числа из массива (пропусков быть не должно).
 * Вариант решения с Arrays.copyOf
 */
public class Task1 {
    public static int[] deleteElementFromArray(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++; // count = 1
            } else {
                array[i - count] = array[i];
            }
        }
        int[] res = Arrays.copyOf(array, array.length - count);
        return res;
    }

    /**
     *
     * @param array
     * @param number
     * @return
     *  Вариант решения с методом написанным вместо Arrays.copyOf
     */
    public static int[] deleteElementFromArrayNew(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++; // count = 1
            } else {
                array[i - count] = array[i];
            }
        }
        int[] res = arraysCopyOf(array, array.length - count);
        return res;
    }

    static int[] arraysCopyOf(int[] array, int sizeNew) {
        int[] arrayNew = new int[sizeNew];
        for (int i = 0; i < sizeNew ; i++) {
            arrayNew[i] = array[i];
        }
        return arrayNew;
    }
}
