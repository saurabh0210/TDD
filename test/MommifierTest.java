import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommifierTest {
    @Test
    public void shouldNotMommifyEmptyString(){
        Mommifier mommifier = new Mommifier();
        assertEquals("", mommifier.mommify(""));
    }
}
