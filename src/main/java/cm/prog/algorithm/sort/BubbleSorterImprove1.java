package cm.prog.algorithm.sort;

/**
 * Created by evans on 8/17/14.
 * <p/>
 * Improve the bubble sort by:
 * 1. adding a position of last exchange index.
 * 2. exit the sorting process if no exchange was made since last round of comparing
 */
public class BubbleSorterImprove1 implements ISorter {
    @Override
    public int[] sort(int[] input, int begin, int end) {
        if (input == null || begin >= end)
            return input;

        int i = end;
        while (i > begin) {

            int pos = -1;
            for (int j = begin; j < i; j++) {
                if (input[j] > input[j + 1]) {
                    SortUtil.swap(input, j, j + 1);
                    pos = j;
                }
            }

            if (pos >= begin)
                i = pos;
            else
                break;
        }

        return input;
    }
}
