package cm.prog.algorithm.sort;

public class BubbleSorterTest extends ISorterTestBase {

    @Override
    protected ISorter createSorter() {
        return new BubbleSorter();
    }
}