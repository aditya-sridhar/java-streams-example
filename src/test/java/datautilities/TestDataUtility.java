package datautilities;

import java.util.ArrayList;
import java.util.List;

public class TestDataUtility {
    //Utility class
    private TestDataUtility(){

    }

    public static List<String> getStringList(){
        List<String> stringList = new ArrayList<>();
        stringList.add("abcdefg");
        stringList.add("abcd");
        stringList.add("bcdbcdabcabc");
        stringList.add("3434b");
        stringList.add("ttttt");
        stringList.add("&&&***");

        return stringList;
    }

    public static List<String> getStringListWithDuplicates(){
        List<String> stringList = new ArrayList<>();
        stringList.add("abcd");
        stringList.add("abcd");
        stringList.add("3434b");
        stringList.add("3434b");
        stringList.add("ttttt");
        stringList.add("&&&***");

        return stringList;
    }
}
