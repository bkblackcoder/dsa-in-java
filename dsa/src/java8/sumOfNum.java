package dsa.src.java8;

import java.util.List;

public class sumOfNum {

    public static void main(String[] args) {

        List<Integer> number=List.of(1,2,35,5,6);

        int sum=number.stream().reduce(0, Integer::sum);

        System.out.print(sum);
    }
}
