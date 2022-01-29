import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AlgoritmTest {

    @Test
    public void sort() {
        System.out.println("----------------Start test sort---------------------");
        int[] result = {1,2,3,4,5};
        int[] inArr = {2,1,5,3,4};

        Algoritm algoritm = new Algoritm();
        assertArrayEquals(result, Algoritm.sort(inArr));
        System.out.println("-----------------------------------------------------");

    }
}