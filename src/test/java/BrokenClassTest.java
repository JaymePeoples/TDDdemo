import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FilenameFilter;
import java.util.Base64;

import static org.junit.Assert.*;

/**
 * Created by jayme on 7/27/2017.
 */
public class BrokenClassTest {
    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void isCardAMatch() throws Exception {
        BrokenClass brokenClass = new BrokenClass();
        boolean expected = true;
        boolean actual = brokenClass.isCardAMatch("ace", "ace1");
        assertTrue("Bad code", actual);
    }

    @Test
    public void baseEncoderFileName() throws Exception {
        BrokenClass brokenClass = new BrokenClass();
        String expected = "c2VjcmV0";
        String actual = brokenClass.baseEncodeFileName("secret");

        assertEquals("failure!", expected, actual);
        //in the actual there is an "s" added, but the expected value has no "s"

    }

    @Test
    public void roundUp() throws Exception {
        BrokenClass brokenClass = new BrokenClass();
        float expected = 1;
        float actual = brokenClass.roundUp(0.7f);

        assertEquals("fail!", expected, actual, 0.0);

    }
}
//    @Test
//    public void sum() throws Exception{
//        BrokenClass brokenClass = new BrokenClass();
//        int expected = sum
//        int result = brokenClass.sum(Integer.MAX_VALUE, b:1);
//
//        assertEquals("fail!", expected, actual, 0.0 );
//}
