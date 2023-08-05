package dev.harini;

//import org.testng.annotations.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// write a unit test case for sample.java
public class LinearSearchTest {
    @Test
    public void testSearch() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int expected = 2;
        int actual = LinearSearch.search(arr, target);
        assertEquals(expected, actual);
    }
}
