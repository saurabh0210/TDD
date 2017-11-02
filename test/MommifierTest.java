import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//Changes
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
    
    @Test
    public void shouldMommifyStringWithOnlyOneVowel()
    {
    	assertEquals("bmommyd",mommifier.mommify("bad"));
    	assertEquals("bmommyd",mommifier.mommify("bed"));
    	assertEquals("bmommyd",mommifier.mommify("bid"));
    	assertEquals("bmommyd",mommifier.mommify("bod"));
    	assertEquals("bmommyd",mommifier.mommify("bud"));
    }
}
