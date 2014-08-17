package cm.prog.algorithm.sort;

public class QuickSorterTest extends ISorterTestBase {

    @Override
    protected ISorter createSorter() {
        return new QuickSorter();
    }
}