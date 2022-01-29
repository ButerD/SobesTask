import org.junit.Test;

import static org.junit.Assert.*;

public class algoritnTest {

    @Test
    public void findFirstRepetNumber() {
        int[] testArr = {2, 4, 3, 2, 4};
        assertEquals(2, algoritn.findFirstRepetNumber(testArr));
    }
}