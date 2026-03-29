package org.stepik.sorts.selectionSort;

public class SelectionSortSolution {
    public static void selectionSort(int[] array) {
        if (array.length == 0)
            return;
        for (var i = 0; i < array.length - 1; i++) {
            var minIndex = i;
            for (var j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            var tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }
}
