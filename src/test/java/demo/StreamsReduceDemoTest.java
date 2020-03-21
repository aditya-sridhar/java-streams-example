package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamsReduceDemoTest {

    List<Integer> input = new ArrayList<>();
    @BeforeEach
    void setUp() {
        input.add(1);
        input.add(-2);
        input.add(100);
        input.add(-200);
        input.add(400);
        input.add(-1000);
        input.add(-1001);
        input.add(23);


    }

    @Test
    void main() {
        StreamsReduceDemo.main(new String[]{});
    }

    @Test
    void getAbsoluteSum() {
        int result = StreamsReduceDemo.getAbsoluteSum(input);
        assertEquals(2727, result);
    }

    @Test
    void getMinOddInteger() {
        int result = StreamsReduceDemo.getMinOddInteger(input);
        assertEquals(-1001, result);
    }

    @Test
    void getEvenIntegerSum() {
        int result = StreamsReduceDemo.getEvenIntegerSum(input);
        assertEquals(-702, result);
    }

    @Test
    void getEmptyIntegerListSum() {
        int result = StreamsReduceDemo.getEmptyIntegerListSum(new ArrayList<>());
        assertEquals(0,result);
    }


    @Test
    void getIntegerSum() {
        int result = StreamsReduceDemo.getIntegerSum(input);
        assertEquals(-1679,result);
    }
}