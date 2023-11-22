public class TripleItemManager {
    public static void main(String[] args) {
        TripleItem<Integer> triInts = new TripleItem<Integer>(100, 200, 300);
        TripleItem<Double> triDoubles = new TripleItem<Double>(1.4, 234.5, 23.53);
        triInts.printAll();
        triDoubles.printAll();
        System.out.println("triInt max: " + triInts.max());
        System.out.println("triInt min: " + triInts.min());
        System.out.println("triDoubles max: " + triDoubles.max());
        System.out.println("triDoubles min: " + triDoubles.min());
    }
}
