import static org.junit.Assert.*;

public class ReverseInteger {
	public int reverse(int x) {
        long result = 0;
        while(x!=0)
        {
            result = result*10 + x%10;
            x=x/10;
        }
        //return (result<Integer.MIN_VALUE||result>Integer.MAX_VALUE)? 0:result;
        if(result<Integer.MIN_VALUE||result>Integer.MAX_VALUE) {
        	return 0;
        }
        return (int) result;
	}
	

	@org.junit.Test
	public void Test() {
		int expectedResult = 0, result;
		result = reverse(1000000003);//reversing the integer will overflow so the expected result is 0
		assertEquals(expectedResult,result);
	}

}
