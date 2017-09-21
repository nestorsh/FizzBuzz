import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FizzBuzzTest extends FizzBuzz {

    @Test
    public void given_2_should_return_2(){
        assertEquals("2", new FizzBuzz().get(2));
    }

    @Test
    public void given_1_should_return_1(){
        assertEquals("1", new FizzBuzz().get(1));
    }

    @Test
    public void given_3_should_return_Fizz(){
        assertEquals("Fizz", new FizzBuzz().get(3));
    }

    @Test
    public void given_6_should_return_Fizz(){
        assertEquals("Fizz", new FizzBuzz().get(6));
    }

    @Test
    public void given_5_should_return_Buzz(){
        assertEquals("Buzz", new FizzBuzz().get(5));
    }

    @Test
    public void given_15_should_return_FizzBuzz(){ assertEquals("FizzBuzz", new FizzBuzz().get(15)); }

}