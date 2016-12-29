import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaExampleTest {
    private Puppy[] puppiesArray;
    int[] numbers = {10, 9, 27, 2031};
    int[] intArray = {1,2,3};

    @Before
    public void setUp() throws Exception {
        Puppy p1 = new Puppy("Fido", "BROWN", 5);
        Puppy p2 = new Puppy("Rosco", "BLACK", 2);
        Puppy p3 = new Puppy("Spot", "BROWN", 3);
        Puppy p4 = new Puppy("Stella", "WHITE", 10);
        Puppy p5 = new Puppy("Rover", "BROWN", 8);
        puppiesArray = new Puppy[] { p1, p2, p3, p4, p5 };
    }

    @Test
    public void anyBrownHair() throws Exception {
        boolean result = JavaExample.anyBrownHair(puppiesArray);
        assertTrue(result);
    }

    @Test
    public void allBrownHair() throws Exception {
        boolean result = JavaExample.allBrownHair(puppiesArray);
        assertFalse(result);
    }

    @Test
    public void sumArray() throws Exception {
        int result = JavaExample.sumArray(numbers);
        assertEquals(result, 2077);
    }

    @Test
    public void times100() throws Exception {
        int[] result = JavaExample.times100(intArray);
        assertArrayEquals(result, new int[] { 100, 200, 300 });
    }

    @Test
    public void findBrownHair() throws Exception {
        Puppy[] result = JavaExample.findBrownHair(puppiesArray);
        assertEquals(result.length, 3);
    }
}
