import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMinElementsTest {

    @Test
    public void Test1(){
        MinMax y = new MinMax(); int[] x = {11,32,53,24,10,-77,4,99};
        assertEquals(-77,y.Min(x)); assertEquals(99, y.Max(x));
    }

    @Test
    public void Test2(){
        MinMax y = new MinMax(); int[] x = {0,-1,-5,-6,-19,-15,-21,-24};
        assertEquals(-24,y.Min(x)); assertEquals(0, y.Max(x));
    }

    @Test
    public void Test3(){
        MinMax y = new MinMax(); int[] x = {100,230,55,91,3450,1541,210,24};
        assertEquals(24,y.Min(x)); assertEquals(3450, y.Max(x));
    }

    @Test
    public void Test4(){
        MinMax y = new MinMax(); int[] x = {1};
        assertEquals(1,y.Min(x)); assertEquals(1, y.Max(x));
    }


}