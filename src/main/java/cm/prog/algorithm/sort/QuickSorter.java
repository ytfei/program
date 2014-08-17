package cm.prog.algorithm.sort;

import com.google.common.base.Verify;

/**
 * Created by evans on 8/16/14.
 */
public class QuickSorter implements ISorter {
    @Override
    public int[] sort(int[] input, int begin, int end) {
        Verify.verifyNotNull(input);

        if (input.length <= 1)
            return input;

        if (begin < end) {
            int pivotIdx = partition(input, begin, end);

            if (pivotIdx == end)
                sort(input, begin, pivotIdx - 1);
            else if (pivotIdx == begin)
                sort(input, pivotIdx + 1, end);
            else {
                sort(input, begin, pivotIdx - 1);
                sort(input, pivotIdx + 1, end);
            }
        }

        return input;
    }

    private int partition(int[] input, int begin, int end) {
        int pivot = input[begin];

        while (begin < end) {
            while (begin < end && input[end] >= pivot)
                end--;

            SortUtil.swap(input, begin, end);

            while (begin < end && input[begin] <= pivot)
                begin++;

            SortUtil.swap(input, begin, end);
        }

        return begin;
    }
}
