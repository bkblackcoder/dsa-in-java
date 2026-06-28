package dsa.src.java8;

import java.util.List;
import java.util.stream.Collectors;

public class convertListOfStringToUpperCase {

    public static void main(String[] args) {
        List<String> strings=List.of("Bittu", "Sandesh");

       List<String> names= strings.stream().map(String::toUpperCase)
                .toList();

       System.out.print(names);
    }
}
