package fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class FizzBuzzTest {

    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3() throws NonPositiveNumberException{
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String convertedNumber = fizzBuzz.convert(number);

        assertThat(convertedNumber,is("fizz"));
    }

    @Test
    public  void shouldReturnBuzzWhenNumberIsMultipleOf5() throws NonPositiveNumberException{
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String convertedNumber = fizzBuzz.convert(number);

        assertThat(convertedNumber,is("buzz"));
    }

    @Test
    public  void shouldReturnFizzBuzzWhenNumberIsMultipleOf3And5() throws NonPositiveNumberException{
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String convertedNumber = fizzBuzz.convert(number);

        assertThat(convertedNumber,is("fizzbuzz"));
    }

    @Test
    public void shouldReturnTheSameNumberWhenNumberIsNotMultipleOf3Or5() throws NonPositiveNumberException{
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String convertedNumber = fizzBuzz.convert(number);

        assertThat(convertedNumber,is(String.valueOf(number)));
    }

    @Test(expected = NonPositiveNumberException.class)
    public void shouldNotReturnNeitherFizzOrBuzzIfNumberIsNegative() throws NonPositiveNumberException{
        int number = -1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.convert(number);
    }

}