package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubtractOperationTest {
    @Test
    void subtractsPositiveNumbers() {
        assertEquals(2.0, new SubtractOperation().execute(5.0, 3.0), 0.000001);
    }

    @Test
    void subtractsNegativeAndDecimalNumbers() {
        assertEquals(-2.5, new SubtractOperation().execute(-2.0, 0.5), 0.000001);
    }
}