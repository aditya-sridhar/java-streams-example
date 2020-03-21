package datautilities;

import java.util.ArrayList;
import java.util.List;

public class DataUtility {

    //Utility class
    private DataUtility(){

    }

    public static List<String> getStringList(){
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("ABCD");
        stringList.add("BCDA");
        stringList.add("BCDAD");
        stringList.add("1234567");
        stringList.add("^%$%$%$%))");
        stringList.add("ABcd23232");
        stringList.add("abCD90%$");
        stringList.add("ZWERTD");
        stringList.add("123456");

        return stringList;
    }

    public static List<String> getStringListWithDuplicates(){
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("");
        stringList.add("ABCD");
        stringList.add("ABCD");
        stringList.add("BCDAD");
        stringList.add("1234567");
        stringList.add("1234567");
        stringList.add("ABcd23232");
        stringList.add("abCD90%$");
        stringList.add("ZWERTD");
        stringList.add("ZWERTD");

        return stringList;
    }

    public static List<Integer> getIntegerList(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(99);
        integerList.add(-450);
        integerList.add(345);
        integerList.add(25);
        integerList.add(60);
        integerList.add(-20);
        return integerList;
    }

    public static List<Integer> getEmptyIntegerList(){
        return new ArrayList<>();
    }
}
