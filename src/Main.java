import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        calculateTime(c -> {
            IntStream.range(0, 100)
                    .boxed()
                    .toList()
                    .stream()
                    .reduce(Integer::sum)
                    .ifPresent(System.out::println);
            return null;
        });
    }

    public static void calculateTime(Function function) {
        var startTime = System.currentTimeMillis();
        function.apply(null);
        var endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000.0) + "s");
    }

    static class Number {
        int num;

        Number(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        @Override
        public String toString() {
            return "Number{" +
                    "num=" + num +
                    '}';
        }
    }
}