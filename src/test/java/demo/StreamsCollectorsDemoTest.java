package demo;

import datautilities.TestDataUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StreamsCollectorsDemoTest {

    List<String> input = new ArrayList<>();
    @BeforeEach
    void setUp() {
    }

    @Test
    void main() {
        StreamsCollectorsDemo.main(new String[]{});
    }

    @Test
    void convertListToMap() {
        input = TestDataUtility.getStringList();
        Map<String,String> result = StreamsCollectorsDemo.convertListToMap(input);

        Map<String, String> expected = new HashMap<String, String>() {
            {
                put("abcdefg7", "abcdefg");
                put("abcd4", "abcd");
                put("bcdbcdabcabc12", "bcdbcdabcabc");
                put("3434b5", "3434b");
                put("ttttt5", "ttttt");
                put("&&&***6", "&&&***");
            }
        };
            assertEquals(expected, result);
    }

    @Test
    void filterConvertListToSet() {
        input = TestDataUtility.getStringListWithDuplicates();
        Set<String> result = StreamsCollectorsDemo.filterConvertListToSet(input);

        Set<String> expected = Stream.of("abcd","3434b","ttttt","&&&***").collect(Collectors.toSet());

        assertEquals(expected, result);

    }
}