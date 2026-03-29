package org.stepik.sorts.selectionSort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortSolutionTest {
    @Test
    void selectionSort_emptyArray_remainsEmpty() {
        int[] array = {};
        SelectionSortSolution.selectionSort(array);
        assertThat(array).isEmpty();
    }

    @Test
    void selectionSort_singleElementArray_remainsUnchanged() {
        int[] array = {42};
        SelectionSortSolution.selectionSort(array);
        assertThat(array).containsExactly(42);
    }

    @Test
    void selectionSort_alreadySortedArray_remainsSorted() {
        int[] array = {1, 2, 3, 4, 5};
        SelectionSortSolution.selectionSort(array);
        assertThat(array).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void selectionSort_reverseSortedArray_becomesSorted() {
        int[] array = {5, 4, 3, 2, 1};
        SelectionSortSolution.selectionSort(array);
        assertThat(array).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void selectionSort_unsortedArray_becomesSorted() {
        int[] array = {3, 1, 4, 1, 5, 9, 2};
        SelectionSortSolution.selectionSort(array);
        assertThat(array).containsExactly(1, 1, 2, 3, 4, 5, 9);
    }

    @Test
    void selectionSort_arrayWithDuplicates_becomesSorted() {
        int[] array = {2, 3, 2, 1, 3};
        SelectionSortSolution.selectionSort(array);
        assertThat(array).containsExactly(1, 2, 2, 3, 3);
    }

    @Test
    void selectionSort_arrayWithNegativeNumbers_becomesSorted() {
        int[] array = {-1, -3, 0, 2, -2};
        SelectionSortSolution.selectionSort(array);
        assertThat(array).containsExactly(-3, -2, -1, 0, 2);
    }
}
