import java.util.ArrayList;
import java.util.List;

public class Task {
    public static class Triplet<T, U, V> {
        public <T>first;
        public <U>second;
        public <V>third;

        public Triplet(T first, U second, V third) {
            this.T = first;
            this.U = second;
            this.V = third;
        }


        public static String result;

        public static void main(String[] args) {
            Calculator c = new Calculator();
            List<Triplet<Double, Double, String>> t = new ArrayList<>();
            t.add(new Triplet<>(3.4, 5.2, "+"));
            t.add(new Triplet<>(2.3, 1.23, "-"));
            t.add(new Triplet<>(4.5, 5.4, "*"));
            t.add(new Triplet<>(5.5, 0, "/"));
            t.add(new Triplet<>(56.0, 28.0, "/"));

            t.forEach(item -> result += "\n" + c.compute(item.first, item.second, item.third));
            System.out.println(result);
        }
    }
