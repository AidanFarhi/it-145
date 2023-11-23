public class TripleItem <T extends Comparable<T>> {

    private T item1;
    private T item2;
    private T item3;

    public TripleItem(T item1, T item2, T item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public void printAll() {
        System.out.println("(" + item1 + "," + item2 + "," + item3 + ")");
    }

    public T min() {
        T minVal = item1;
        if (item2.compareTo(minVal) < 0) minVal = item2;
        if (item3.compareTo(minVal) < 0) minVal = item3;
        return minVal;
    }

    public T max() {
        T maxVal = item1;
        if (item2.compareTo(maxVal) > 0) maxVal = item2;
        if (item3.compareTo(maxVal) > 0) maxVal = item3;
        return maxVal;
    }
}
