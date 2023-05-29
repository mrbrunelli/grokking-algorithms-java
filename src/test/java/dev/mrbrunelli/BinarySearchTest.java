package dev.mrbrunelli;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private final BinarySearch sut = new BinarySearch();

    @Test
    public void testCase1() {
        int[] list = IntStream.of(10, 20, 30, 40, 44, 48, 55).toArray();
        assertEquals(4, sut.play(list, 44));
    }

    @Test
    public void testCase2() {
        int[] list = IntStream.of(10, 20, 30, 40, 44, 48, 55).toArray();
        assertEquals(6, sut.play(list, 55));
    }

    @Test
    public void testCase3() {
        int[] list = IntStream.of(10, 20, 30, 40, 44, 48, 55).toArray();
        assertEquals(-1, sut.play(list, 11));
    }
}
