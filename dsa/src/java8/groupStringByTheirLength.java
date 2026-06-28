package dsa.src.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupStringByTheirLength {

    public static void main(String[] args) {
        List<String> strings=List.of("Bob", "Cat", "Rat", "Apple", "Fish");

        Map<Integer, List<String>> result=strings.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.print(result);
    }
}
