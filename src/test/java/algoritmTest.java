import org.junit.Test;

import static org.junit.Assert.*;

public class algoritmTest {

    @Test
    public void findFirstRepetNumber() {
        int[] testArr = {2, 4, 3, 2, 4};
        assertEquals(2, Algoritm.findFirstRepetNumber(testArr));
    }
}