package functionutilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerUtilityTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void isEven() {
        int val = 25;
        boolean result = IntegerUtility.isEven(val);
        assertFalse(result);

        val = 26;
        result = IntegerUtility.isEven(val);
        assertTrue(result);
    }

    @Test
    void isOdd() {
        int val = 25;
        boolean result = IntegerUtility.isOdd(val);
        assertTrue(result);

        val = 26;
        result = IntegerUtility.isOdd(val);
        assertFalse(result);
    }
}