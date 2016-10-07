/**
 * Created by Alexander_Demidovich on 10/7/2016.
 */

import Handler.Handler;
import jdk.internal.org.objectweb.asm.Handle;
import junit.framework.TestCase;
import Main.Main;
import org.junit.After;
import org.junit.Before;

public class JUnitTests extends TestCase {
    double testNumberX,testNumberY;
    @Before
    protected void setUp() throws Exception {

    }
    @After
    protected void tearDown() throws Exception {

    }
    public void testNegativeNumber() {
        boolean expected = false;
        testNumberX = -1.0;
        testNumberY = -21.0;
        boolean actual = Handler.checkData(testNumberX, testNumberY);
        assertEquals(expected, actual);
    }
    public void testCalculateValueOfExpression(){
        double expected = 0.5;
        testNumberX = 0;
        testNumberY = 0;
        double actual = Handler.calculateValueOfExpression(testNumberX,testNumberY);
        assertEquals(expected, actual);

        expected = 0.85;
        testNumberX = 0;
        testNumberY = 1;
        actual = Handler.calculateValueOfExpression(testNumberX,testNumberY);
        assertEquals(expected, actual,0.01);
    }
}
