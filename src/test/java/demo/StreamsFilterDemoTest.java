package demo;

import datautilities.TestDataUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StreamsFilterDemoTest {

    List<String> input = new ArrayList<>();
    @BeforeEach
    void setUp() {
       input = TestDataUtility.getStringList();
    }

    @Test
    void main() {
        StreamsFilterDemo.main(new String[]{});
    }

    @Test
    void getEvenLengths() {
        List<Integer> result = StreamsFilterDemo.getEvenLengths(input);
        List<Integer> expected = Stream.of(4,12,6).collect(Collectors.toList());
        assertEquals(expected,result);
    }

    @Test
    void greaterThan6() {
        List<String> result = StreamsFilterDemo.greaterThan6(input);
        List<String> expected = Stream.of("abcdefg","bcdbcdabcabc")
                .collect(Collectors.toList());
        assertEquals(expected,result);
    }
}