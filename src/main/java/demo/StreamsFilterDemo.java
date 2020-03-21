package demo;

import datautilities.DataUtility;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterDemo {
    public static void main(String[] args){
        List<String> stringList = getInput();

        greaterThan6(stringList);

        getEvenLengths(stringList);

    }

    public static List<Integer> getEvenLengths(List<String> stringList) {
        System.out.println("Map each String to its length and filter only even lengths");
        List<Integer> evenLengths = stringList.stream().map(String::length).filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenLengths);
        return evenLengths;
    }

    public static List<String> greaterThan6(List<String> stringList) {
        System.out.println("Get only Strings with length greater than 6");
        List<String> greater6 = stringList.stream().filter(str -> str.length() > 6).collect(Collectors.toList());
        System.out.println(greater6);
        return greater6;
    }

    private static List<String> getInput() {
        List<String> stringList = DataUtility.getStringList();
        System.out.println("Input");
        System.out.println(stringList);
        return stringList;
    }


}
