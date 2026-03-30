package org.stepik.sorts.insertionSort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertionSortSolutionTest {
    @Test
    void selectionSort_emptyArray_remainsEmpty() {
        int[] array = {};
        InsertionSortSolution.insertionSort(array);
        assertThat(array).isEmpty();
    }

    @Test
    void insertionSort_singleElementArray_remainsUnchanged() {
        int[] array = {42};
        InsertionSortSolution.insertionSort(array);
        assertThat(array).containsExactly(42);
    }

    @Test
    void insertionSort_alreadySortedArray_remainsSorted() {
        int[] array = {1, 2, 3, 4, 5};
        InsertionSortSolution.insertionSort(array);
        assertThat(array).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void insertionSort_reverseSortedArray_becomesSorted() {
        int[] array = {5, 4, 3, 2, 1};
        InsertionSortSolution.insertionSort(array);
        assertThat(array).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void insertionSort_unsortedArray_becomesSorted() {
        int[] array = {3, 1, 4, 1, 5, 9, 2};
        InsertionSortSolution.insertionSort(array);
        assertThat(array).containsExactly(1, 1, 2, 3, 4, 5, 9);
    }

    @Test
    void insertionSort_arrayWithDuplicates_becomesSorted() {
        int[] array = {2, 3, 2, 1, 3};
        InsertionSortSolution.insertionSort(array);
        assertThat(array).containsExactly(1, 2, 2, 3, 3);
    }

    @Test
    void insertionSort_arrayWithNegativeNumbers_becomesSorted() {
        int[] array = {-1, -3, 0, 2, -2};
        InsertionSortSolution.insertionSort(array);
        assertThat(array).containsExactly(-3, -2, -1, 0, 2);
    }
}
