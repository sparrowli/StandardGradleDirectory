import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecHelloWorld {

    private HelloWorld helloWorld;
    @Before
    public void setup() {
	 helloWorld = new HelloWorld();
    }


    @Test
    public void should_return_the_sum_of_two_number_correctly() {
        int sum = helloWorld.add(5, 6);

        assertEquals(11, sum);
    }
}

