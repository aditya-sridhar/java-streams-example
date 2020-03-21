package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StreamsMapDemoTest {

    List<String> input = new ArrayList<>();
    @BeforeEach
    void setUp() {
        input.add("B");
        input.add("ab");
    }

    @Test
    void mapToUpperCaseAndSort() {
       List<String> result =  StreamsMapDemo.mapToUpperCaseAndSort(input);
       List<String> expected = Stream.of("AB", "B")
                .collect(Collectors.toList());
       assertEquals(expected,result);

    }

    @Test
    void sortAndMapToUpperCase() {
        List<String> result =  StreamsMapDemo.sortAndMapToUpperCase(input);
        List<String> expected = Stream.of("B", "AB")
                .collect(Collectors.toList());
        assertEquals(expected,result);
    }

    @Test
    void mapToUpperCase() {
        input.add("1c");
        List<String> result =  StreamsMapDemo.mapToUpperCase(input);
        List<String> expected = Stream.of("B", "AB","1C")
                .collect(Collectors.toList());
        assertEquals(expected,result);
    }

    @Test
    void mapToLength() {
        input.add("1cbd");
        List<Integer> result =  StreamsMapDemo.mapToLength(input);
        List<Integer> expected = Stream.of(1,2,4)
                .collect(Collectors.toList());
        assertEquals(expected,result);
    }

    @Test
    void main() {
        StreamsMapDemo.main(new String[]{});
    }
}