package dsa.src.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateEvenOdd {
    public static void main(String[] args) {
        int[] evenOdd = {1, 2, 3, 4, 5, 6};

        // 1. Partition the numbers into true (even) and false (odd)
        Map<String, List<Integer>> result = Arrays.stream(evenOdd)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .entrySet().stream().collect(Collectors.toMap(
                        entry-> entry.getKey() ? "Even" : "ODD",
                        Map.Entry::getValue
                ));

        // OR
        Map<Boolean, List<Integer>> res=Arrays.stream(evenOdd)
                        .boxed()
                                .collect(Collectors.partitioningBy(n-> n%2==0));

        List<Integer> even=res.get(true);
        List<Integer> odd=res.get(false);

        System.out.print(even);
        System.out.print(odd);


        System.out.println(result);

    }
}
