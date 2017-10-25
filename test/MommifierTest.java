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
    
    @Test
    public void shouldMommifySingleVowelString() {
    	assertEquals("mommy", mommifier.mommify("a"));
    	assertEquals("mommy", mommifier.mommify("e"));
    	assertEquals("mommy", mommifier.mommify("i"));
    	assertEquals("mommy", mommifier.mommify("o"));
    	assertEquals("mommy", mommifier.mommify("u"));
    }
}
