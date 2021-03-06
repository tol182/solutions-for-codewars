package theclockwisespiral;

import org.junit.Assert;
import org.junit.Test;

public class TheClockwiseSpiralTest {
    
    @Test
    public void should_test_spiral() {
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
                
        Assert.assertArrayEquals(expected, TheClockwiseSpiral.createSpiral(3));
        
    }
}
