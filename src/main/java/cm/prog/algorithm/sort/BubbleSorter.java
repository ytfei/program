package cm.prog.algorithm.sort;

/**
 * Created by evans on 8/17/14.
 */
public class BubbleSorter implements ISorter {
    @Override
    public int[] sort(int[] input, int begin, int end) {
        if (input == null || begin >= end)
            return input;

        for (int i = begin; i <= end; i++) {
            for (int j = begin; j < end - i; j++) {
                if (input[j] > input[j + 1]) {
                    SortUtil.swap(input, j, j + 1);
                }
            }
        }

        return input;
    }
}
