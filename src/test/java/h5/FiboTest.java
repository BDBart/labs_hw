package h5;

import h5.Fibo.Fibo;
import org.junit.Test;
import static org.junit.Assert.*;

public class FiboTest {

    @Test
    public void testNormalFibonacciSequence(){
        //given
        Fibo fibo = new Fibo();

        //when
        fibo.run(6);

        //then
        int result = fibo.getResult();
        assertEquals(8, result);
    }

    @Test
    public void testFiboWithStartNumber(){
        //given
        Fibo fibo = new Fibo();

        //when
        fibo.run(4, 6);

        //then
        int result = fibo.getResult();
        assertEquals(32, result);
    }
}
