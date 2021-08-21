package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculator {
	 public static void main(String args[])
	    {
	        System.out.println("Starting the code and Test Cases");
	    }
	 	@Test
	    public void testEmptyString()
	    {
	        assertEquals(0, StringCalculator.Add(""));
	    }

	    @Test
	    public void oneNumber()
	    {
	        assertEquals(1, StringCalculator.Add("1"));
	    }

	    @Test
	    public void twoNumbers()
	    {
	        assertEquals(3, StringCalculator.Add("1,2"));
	    }

	    @Test
	    public void threeNumbers()
	    {
	        assertEquals(6, StringCalculator.Add("1,2,3"));
	    }

	    @Test
	    public void testNewLine()
	    {
	    	assertEquals(6, StringCalculator.Add("1\n2,3"));
	    }
	    @Test
	    public void otherDelimiter()
	    {
	        assertEquals(3, StringCalculator.Add("//;\n1;2"));
	    }
	    
	    @Test
	    public void overThousand()
	    {
	        assertEquals(2, StringCalculator.Add("1000,2"));
	    }
}
