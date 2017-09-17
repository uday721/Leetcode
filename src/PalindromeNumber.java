import static org.junit.Assert.*;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int result=0, y=x;
        while(x>0){
            result = result*10 + x%10;
            x/=10;
        }
        return result == y;
        
    }
	@org.junit.Test
	public void Test() {
		boolean expectedOutput = true;
		assertEquals(expectedOutput,isPalindrome(343));
	}
}
