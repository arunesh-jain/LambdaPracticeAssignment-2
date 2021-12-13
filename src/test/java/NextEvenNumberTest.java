
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextEvenNumberTest {

    List<Integer> integerArrayList = new ArrayList<Integer>(48564);

    @Test
    public void shouldReturn1() {

        List<Integer> expected = Arrays.asList(48566);
        Assert.assertEquals(expected, 48566);
    }

    @Test
    public void shouldReturn2() {
        int number1=18;
        int number2=30;

        Assert.assertEquals(number1,number2);
    }
}
