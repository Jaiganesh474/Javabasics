package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,4,2,4,5,7,9,8);

        Stream<Integer> s1= nums.stream();
        Stream<Integer> s2= nums.stream().filter(n -> n%2==0);
        Stream<Integer> s3= nums.stream().map(n -> n*n);
        Stream<Integer> s4= nums.stream().sorted();
        Stream<Integer> s5= nums.stream().distinct();
        Stream<Integer> s6= nums.stream().limit(5);
        Stream<Integer> s7= nums.stream().skip(3);
        Stream<Integer> s8= nums.stream().peek(n -> System.out.println("Element: " + n));
        Stream<Integer> s9= nums.stream().flatMap(n -> Stream.of(n, n+1));
        Stream<Integer> s10= nums.stream().reduce(Integer::sum).stream();
        Stream<Integer> s11= nums.stream().toList().stream();
        Stream<Integer> s12= nums.stream().mapToInt(Integer::intValue).boxed();
        Stream<Integer> s13= nums.stream();
        Stream<Integer> s14= nums.stream();

        int result=nums.stream()
                .filter(n-> n % 2 == 0)
                .map(n-> n * 2)
                .reduce(0, (a, b) -> a + b);

        System.out.println(result);// Sum of squares

    }
}
