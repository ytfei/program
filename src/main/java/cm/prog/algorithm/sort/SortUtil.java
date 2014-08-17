package cm.prog.algorithm.sort;

import com.google.common.base.Verify;

/**
 * Created by evans on 8/16/14.
 */
public final class SortUtil {
    public static void swap(int[] data, int src, int dst) {
        Verify.verify(data != null && src < data.length && dst < data.length);

        int x = data[src];
        data[src] = data[dst];
        data[dst] = x;
    }
}
