import junit.*;

public class TDDTESTCASE extends BaseTest {
		public void init() {
			Calculator = new Calculator();
		}
		public int testsubstract(int a, int b) {
			return a-b;
			assertEquals(1,result);
		int result= calculator.substract(2,1);
		}
		public void testadd() {
			Calculator calculator=new Calculator();
			int result = calculator.add(1,2);
			assertEquals(3,result);
			}
		public void testaddwithzero() {
			Calculator calculator=new Calculator();
			int result = calculator.add(0,2);
			assertEquals(2,result);
		}
}
