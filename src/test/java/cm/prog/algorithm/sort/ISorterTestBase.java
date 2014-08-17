package cm.prog.algorithm.sort;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Base class for all sorter implementation, here will provide all kinds of data for test cases.
 */
public abstract class ISorterTestBase {

    @Test(dataProvider = "data")
    public void testSort(int[] input, int[] output) throws Exception {
        ISorter sorter = createSorter();

        Assert.assertEquals(sorter.sort(input, 0, input.length - 1), output);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        return new Object[][]{
                {new int[]{}, new int[]{}},
                {new int[]{0}, new int[]{0}},
                {new int[]{1, 1, 1}, new int[]{1, 1, 1}},
                {new int[]{1, 2, 1}, new int[]{1, 1, 2}},
                {new int[]{1, 2, 3}, new int[]{1, 2, 3}},
                {new int[]{3, 2, 1}, new int[]{1, 2, 3}}
        };
    }

    protected abstract ISorter createSorter();
}