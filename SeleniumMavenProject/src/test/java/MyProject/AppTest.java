package MyProject;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void hello()
    {
    	System.out.println("Hello");
    }
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void doSomething()
    {
        Assert.assertEquals(true,true);
    }
}
