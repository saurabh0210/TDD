import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommifierTest {

    private Mommifier mommifier;

    @Before
    public void setUp(){
        mommifier = new Mommifier();
    }

    @Test
    public void shouldNotMommifyEmptyString(){
        assertEquals("", mommifier.mommify(""));
    }

    @Test
    public void shouldNotMommifyConsonantString(){
        assertEquals("b", mommifier.mommify("b"));
    }
}
