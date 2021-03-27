import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sumOfDigits(){
        int num = -10230405;
        int sum = Main.sumOfDigits(num);
        assertEquals(15, sum);
    }

    @Test
    void threeHighest(){
        double[] array = {Double.MIN_VALUE, 1.2, 0.0, -9.9, 45.8, 46.3, 24.2};
        List<Double> maxes = Main.threeHighest(array);
        assertAll(
                () -> assertEquals(24.2, maxes.get(0)),
                () -> assertEquals(45.8, maxes.get(1)),
                () -> assertEquals(46.3, maxes.get(2))
        );
    }

    @Test
    void threeHighestOfTheTwoElements() {
        double[] array = {3.2, 2.2};
        List<Double> maxes = Main.threeHighest(array);
        assertAll(
                () -> assertEquals(2.2, maxes.get(0)),
                () -> assertEquals(3.2, maxes.get(1)),
                () -> assertNull(maxes.get(2))
        );
    }

    @Test
    void threeHighestOfTheOneElements() {
        double[] array = {1.0};
        List<Double> maxes = Main.threeHighest(array);
        assertAll(
                () -> assertEquals(1.0, maxes.get(0)),
                () -> assertNull(maxes.get(1)),
                () -> assertNull(maxes.get(2))
        );
    }

    @Test
    void threeHighestFromAnEmptyArray () {
        double[] array = {};
        List<Double> maxes = Main.threeHighest(array);
        assertAll(
                () -> assertNull(maxes.get(0)),
                () -> assertNull(maxes.get(1)),
                () -> assertNull(maxes.get(2))
        );
    }

    @Test
    void threeHighestFromNull () {
        double[] array = null;
        List<Double> maxes = Main.threeHighest(array);
        assertNull(maxes);
    }

}