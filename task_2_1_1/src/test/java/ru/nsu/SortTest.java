package ru.nsu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    @Test
    void test_sort_three_numbers() {
        Integer [] input1  = new Integer[] {1,2,0};
        Integer [] res = Sort.sort(input1);
        assertArrayEquals(new Integer[] {0,1,2}, res);
    }
}