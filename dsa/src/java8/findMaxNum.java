package dsa.src.java8;

import java.util.Arrays;
import java.util.List;

public class findMaxNum {

    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,2,3,4,56,9);

        int max=numbers.stream().
                max(Integer::compare)
                .orElse(0);
        System.out.print(max);
    }
}
