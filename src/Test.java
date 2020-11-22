import java.util.ArrayList;

public class Test {

    public static void main(String args[]) throws InterruptedException {

        // we can provide any strategy to do the sorting
        ArrayList<Integer> array = new ArrayList<>(5);
        array.add(1);
        array.add(3);
        array.add(5);
        array.add(4);
        array.add(2);

        Context ctx = new Context(new BubbleSort());
        ctx.arrange(array);

        // we can change the strategy without changing Context class
        ctx = new Context(new QuickSort());
        ctx.arrange(array);

        // try it yourself then …
        ctx = new Context(new MergeSort());
        ctx.arrange(array);

        ctx = new Context(new InsertionSort());
        ctx.arrange(array);
    }
}
