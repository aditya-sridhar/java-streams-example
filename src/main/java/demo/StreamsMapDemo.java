package demo;

import java.util.List;
import java.util.stream.Collectors;

import datautilities.DataUtility;

public class StreamsMapDemo {

    public static void main(String[] args) {
        List<String> stringList = getInput();

        mapToLength(stringList);

        mapToUpperCase(stringList);

        sortAndMapToUpperCase(stringList);

        mapToUpperCaseAndSort(stringList);

    }

    private static List<String> getInput() {
        List<String> stringList = DataUtility.getStringList();
        System.out.println("Input");
        System.out.println(stringList);
        return stringList;
    }

    public static List<String> mapToUpperCaseAndSort(List<String> stringList) {
        System.out.println("Map to UpperCase and then Sort");
        List<String> stringUpperSorted = stringList.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println(stringUpperSorted);
        return stringUpperSorted;
    }

    public static List<String> sortAndMapToUpperCase(List<String> stringList) {
        System.out.println("Sort and Map to UpperCase");
        List<String> stringSortedUpper = stringList.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(stringSortedUpper);
        return stringSortedUpper;
    }

    public static List<String> mapToUpperCase(List<String> stringList) {
        System.out.println("Map to UpperCase");
        List<String> stringUpper = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(stringUpper);
        return stringUpper;
    }

    public static List<Integer> mapToLength(List<String> stringList) {
        System.out.println("Map to Lengths");
        List<Integer> stringLengths = stringList.stream().map(String::length).collect(Collectors.toList());
        System.out.println(stringLengths);
        return stringLengths;
    }
}
