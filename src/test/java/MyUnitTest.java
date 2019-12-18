import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyUnitTest {
    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwothree", result); // failing on purpose to test gradle on pipeline
    }
}
