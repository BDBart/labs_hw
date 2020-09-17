package h5;

import h5.Greatest.GreatestChecker;
import org.junit.Test;
import static org.junit.Assert.*;


public class GreatestTest {
    @Test
    public void testGreatestWithIntParams(){
        //given
        GreatestChecker greatestChecker = new GreatestChecker();

        //when
        int greatestNumber = greatestChecker.greatest(4, 5);

        //then
        assertEquals(5, greatestNumber);
    }

    @Test
    public void testGreatestWithStringParams(){
        //given
        GreatestChecker greatestChecker = new GreatestChecker();
        String shortString = "kaas";
        String longString = "boerderij";

        //when
        int greatestNumber = greatestChecker.greatest(shortString, longString);

        //then
        assertEquals(9, greatestNumber);
    }

    @Test
    public void testGreatestWithUnknownAmountOfIntParams(){
        //given
        GreatestChecker greatestChecker = new GreatestChecker();
        int[] someNumbers = {1,2,3,4,5,6,7,8,9};

        //when
        int greatestNumber = greatestChecker.greatest(someNumbers);

        //then
        assertEquals(9, greatestNumber);
    }

    @Test
    public void testFactorial(){
        //given
        GreatestChecker greatestChecker = new GreatestChecker();

        //when
        int factorialResult = greatestChecker.factorial(5);

        assertEquals(120, factorialResult);
    }
}
