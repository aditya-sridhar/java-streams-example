package demo;

import datautilities.TestDataUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamsGroupingByDemoTest {

    List<String> input = new ArrayList<>();
    @BeforeEach
    void setUp() {
        input = TestDataUtility.getStringList();
    }

    @Test
    void main() {
        StreamsGroupingByDemo.main(new String[]{});
    }

    @Test
    void groupByLengthAndUpper() {
    }

    @Test
    void groupByLength() {
    }
}