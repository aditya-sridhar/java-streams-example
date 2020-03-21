package demo;

import datautilities.DataUtility;
import functionutilities.IntegerUtility;

import java.util.List;

public class StreamsReduceDemo {
    public static void main(String[] args){
        List<Integer> integerList = getInput();

        getIntegerSum(integerList);

        List<Integer> emptyIntegerList = getEmptyIntegerList();
        getEmptyIntegerListSum(emptyIntegerList);

        getEvenIntegerSum(integerList);

        getMinOddInteger(integerList);

        getAbsoluteSum(integerList);

    }

    public static int getAbsoluteSum(List<Integer> integerList) {
        System.out.println("Make all values positive and find the sum");
        int posSum = integerList.stream().map(Math::abs).reduce(Integer::sum).orElse(0);
        System.out.println(posSum);
        return posSum;
    }

    public static int getMinOddInteger(List<Integer> integerList) {
        System.out.println("get Minimum odd Integer");
        int minOddInteger = integerList.stream().filter(IntegerUtility::isOdd).reduce(Integer::min).orElse(0);
        System.out.println(minOddInteger);
        return minOddInteger;
    }

    public static int getEvenIntegerSum(List<Integer> integerList) {
        System.out.println("Get sum of all even integers");
        int evenSumVal = integerList.stream().filter(i -> i %2 == 0).reduce(Integer::sum).orElse(0);
        System.out.println(evenSumVal);
        return evenSumVal;
    }

    public static int getEmptyIntegerListSum(List<Integer> emptyIntegerList) {
        System.out.println("Sum of Empty Integer List");
        int emptySumVal = emptyIntegerList.stream().reduce(Integer::sum).orElse(0);
        System.out.println(emptySumVal);
        return emptySumVal;
    }


    public static int getIntegerSum(List<Integer> integerList) {
        System.out.println("Get sum of all integers");
        int sumVal = integerList.stream().reduce(Integer::sum).orElse(0);
        System.out.println(sumVal);
        return sumVal;
    }

    private static List<Integer> getInput() {
        List<Integer> integerList = DataUtility.getIntegerList();
        System.out.println("Input");
        System.out.println(integerList);
        return integerList;
    }


    private static List<Integer> getEmptyIntegerList() {
        return DataUtility.getEmptyIntegerList();
    }
}
