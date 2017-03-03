import static org.junit.Assert.*;
import org.junit.*;

public class ApplicationTests {

	private Calculations _calc;
	private int _valueA;
	private int _valueB;
	
	
	@Before
	 public void InitializeCalculationVariables(){
	    _calc = new Calculations();
	    _valueA = 5;
	    _valueB = 2;
	  }
	
	@Test(timeout=1000)
	public void Test_Calculations_Multiply_Pass() {
		assertEquals("Should be 10", 10,_calc.Multiply(_valueA, _valueB));	
	}

	@Test(timeout=1000)
	public void Test_Calculations_Multiply_Fail() {
		assertNotEquals("Should not be 10", 10,_calc.Multiply(_valueA, _valueB));	
	}
	
}
