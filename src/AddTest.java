import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Reza on 8/28/2018.
 */
public class AddTest extends TestCase {
    Add add;
    protected void setUp(){
        add = new Add();
    }

    protected void tearDown(){
        add = null;
    }

    public void testAdd() {
        Assert.assertEquals(2, add.add(1, 1));
        Assert.assertEquals(0, add.add(1, -1));

        Assert.assertEquals(1, add.sub(2, 1));
        Assert.assertEquals(0, add.sub(1, 1));
    }
}