package dsa.src.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class countWordOccurences {

    public static void main(String[] args) {
        List<String>  string=List.of("Cat", "Cat", "rat", "apple");

        Map<String, Long> result=string.stream().collect(Collectors.groupingBy(word-> word, Collectors.counting()));

        System.out.print(result);
    }
}
