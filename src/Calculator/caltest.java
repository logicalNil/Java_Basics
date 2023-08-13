package Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class caltest {
    @Test
    public void testAdd() {
        calcode ob = new calcode();
        int result = ob.add(10, 15);
        assertEquals(25, result);
    }
    @Test
    public void testSub() {
        calcode ob = new calcode();
        int result = ob.sub(10, 15);
        assertEquals(-5, result);
    }
    @Test
    public void testMul() {
        calcode ob = new calcode();
        int result = ob.mul(150, 15);
        assertEquals(150, result);
    }
    @Test
    public void testDiv() {
        calcode ob = new calcode();
        int result = ob.div(10, 15);
        assertEquals(0, result);
        {
        System.out.println("Test Failed");
    }
    }

}
