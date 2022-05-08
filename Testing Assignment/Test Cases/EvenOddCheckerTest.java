import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddCheckerTest {

    @Test
    public void Test1(){
        EvenOddChecker x = new EvenOddChecker(); int n = 4;
        assertEquals("Even",x.check(n));
    }

    @Test
    public void Test2(){
        EvenOddChecker x = new EvenOddChecker(); int n = 7;
        assertEquals("Odd",x.check(n));
    }


    @Test
    public void Test3(){
        EvenOddChecker x = new EvenOddChecker(); int n = 9;
        assertEquals("Odd",x.check(n));
    }

    @Test
    public void Test4(){
        EvenOddChecker x = new EvenOddChecker(); int n = 0;
        assertEquals("Even",x.check(n));
    }

    @Test(expected = IllegalArgumentException.class) public void negative(){
        EvenOddChecker x = new EvenOddChecker(); int n = -4;
        x.check(n);
    }



}