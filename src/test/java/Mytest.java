import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by bfhuang on 5/1/17.
 */
public class Mytest {
    @Test
    public void testName() throws Exception {
        assertThat(1, is(2));

    }
}
