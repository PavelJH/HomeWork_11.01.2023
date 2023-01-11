package task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void deleteElementFromArrayTest() {
        assertArrayEquals(new int[]{4, 5, -3, 8}, Task1.deleteElementFromArray(new int[]{4, 5, 7, -3, 7, 8}, 7));

    }


    @Test
    public void arraysCopyOf() {
        int[] actual = {4, 5, -3, 8};
        int[] expected = {4, 5, -3};
        assertArrayEquals(expected, Task1.arraysCopyOf(actual, 3));
    }

    @Test
    public void deleteElementFromArrayNewTest() {
        int[] actual = {4, 5, 7, -3, 7, 8};
        int[] expected = {4, 5, -3, 8};
        assertArrayEquals(expected, Task1.deleteElementFromArrayNew(actual, 7));
    }
}