import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.Test;

public class ArraysTest {

	@Test
	public void testFindMax() {
		int[] arr = new int[4];
		arr[0]=98;
		arr[1]=2;
		arr[2] = 4;
		arr[3] = 9;
		int answer = Arrays.findMax(arr);
		assertEquals(98, answer);
	}
	
	@Test
	public void testFindMin() {
		int[] arr = new int[4];
		arr[0]=98;
		arr[1]=2;
		arr[2] = 4;
		arr[3] = 9;
		int answer = Arrays.findMin(arr);
		assertEquals(2, answer);
	}
	
	@Test
	public void testFindAvg() {
		int[] arr = new int[4];
		arr[0]=98;
		arr[1]=2;
		arr[2] = 4;
		arr[3] = 9;
		double answer = Arrays.findAvg(arr);
		assertEquals(28.25, answer, 0.001);
	}
	
	@Test
	public void testFindTotal() {
		int[] arr = new int[4];
		arr[0]=98;
		arr[1]=2;
		arr[2] = 4;
		arr[3] = 9;
		int answer = Arrays.findTotal(arr);
		assertEquals(113, answer);
	}
	
	

}
