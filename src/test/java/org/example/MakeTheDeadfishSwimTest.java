package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MakeTheDeadfishSwimTest {
        @Test
        public void exampleTests() {
            assertArrayEquals(new int[] {8, 64}, MakeTheDeadfishSwim.parse("iiisdoso"));
            assertArrayEquals(new int[] {8, 64, 3600}, MakeTheDeadfishSwim.parse("iiisdosodddddiso"));
        }
    }