package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheParityOutlierTest {

    @Test
    void sampleTests() {
        assertEquals(3, FindTheParityOutlier.find(new int[] {2, 6, 8, -10, 3}));
        assertEquals(206847684, FindTheParityOutlier.find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        assertEquals(0, FindTheParityOutlier.find(new int[] {Integer.MAX_VALUE, 0, 1}));
    }
}