package org.example.day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String args[])
    {
    List<Integer> numbers = Arrays.asList(1,2,5,3,4,123,12312,321928); //Group them in odd and even


    //Sort the numbers
    List<Integer> sortedValue = numbers.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
    System.out.println("Number  -- "+ sortedValue);

    List<String> word = Arrays.asList("Java","C++","NET");

    List<String> upperC = word.stream()
            .map(String::toLowerCase)
            .collect(Collectors.toList());

    System.out.println("Uppercase"+upperC);

    Map<String, List<Integer>> groupOfNumberEvenAndOdd =
    numbers.stream().collect(
            Collectors.groupingBy(temp -> (temp % 2 == 0) ? "Even" : "Odd" ));
    System.out.println("Answer -- "+ groupOfNumberEvenAndOdd);

    }
}
