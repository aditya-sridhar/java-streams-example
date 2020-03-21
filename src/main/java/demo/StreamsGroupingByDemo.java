package demo;

import datautilities.DataUtility;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingByDemo {

    public static void main(String[] args){
        List<String> stringList = getInput();

        groupByLength(stringList);

        groupByLengthAndUpper(stringList);
    }

    public static Map<Integer, List<String>> groupByLengthAndUpper(List<String> stringList) {
        System.out.println("group by String lengths and convert to upper case");
        Map<Integer,List<String>> groupByLengthEven = stringList.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.mapping(String::toUpperCase, Collectors.toList())));
        System.out.println(groupByLengthEven);
        return groupByLengthEven;
    }

    public static Map<Integer, List<String>> groupByLength(List<String> stringList) {
        System.out.println("group by String lengths");
        Map<Integer,List<String>> groupByLength = stringList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);
        return groupByLength;
    }

    private static List<String> getInput() {
        List<String> stringList = DataUtility.getStringList();
        System.out.println("Input");
        System.out.println(stringList);
        return stringList;
    }
}
