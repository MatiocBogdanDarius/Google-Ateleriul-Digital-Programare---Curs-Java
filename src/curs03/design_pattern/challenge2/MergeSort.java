package curs03.design_pattern.challenge2;

public class MergeSort implements SortStrategy{
    @Override
    public void sort(Integer[] array) {
        this.sort(array, 0, array.length - 1);
    }

    private void sort(Integer[] array, int start, int end) {
        if (start < end) {
            int m = start + (end - start) / 2;
            sort(array, start, m);
            sort(array, m + 1, end);
            merge(array, start, m, end);
        }
    }

    private void merge(Integer[] array, int start, int middle, int end)
    {
        int n1 = middle - start + 1;
        int n2 = end - middle;
        int[] firstSubarray = new int[n1];
        int[] secondSubarray = new int[n2];

        for (int i = 0; i < n1; ++i)
            firstSubarray[i] = array[start + i];
        for (int j = 0; j < n2; ++j)
            secondSubarray[j] = array[middle + 1 + j];

        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (firstSubarray[i] <= secondSubarray[j]) {
                array[k] = firstSubarray[i];
                i++;
            }
            else {
                array[k] = secondSubarray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = firstSubarray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = secondSubarray[j];
            j++;
            k++;
        }
    }
}
