package demo;

import datautilities.DataUtility;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsCollectorsDemo {
    public static void main(String[] args){
        List<String> stringList = getInput();

        filterConvertListToSet(stringList);

        stringList = DataUtility.getStringList();

        convertListToMap(stringList);
    }

    public static Map<String, String> convertListToMap(List<String> stringList) {
        System.out.println("Convert List to Map");
        Map<String,String> stringMap = stringList.stream().collect(Collectors.toMap(v -> v + v.length(), v -> v));
        System.out.println(stringMap);
        return stringMap;
    }

    public static Set<String> filterConvertListToSet(List<String> stringList) {
        System.out.println("Convert List to Set");
        Set<String> stringSet = stringList.stream().filter(s -> s.length() > 0).collect(Collectors.toSet());
        System.out.println(stringSet);
        return stringSet;
    }

    private static List<String> getInput() {
        List<String> stringList = DataUtility.getStringListWithDuplicates();
        System.out.println("Input");
        System.out.println(stringList);
        return stringList;
    }
}
