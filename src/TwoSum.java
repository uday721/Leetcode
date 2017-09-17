import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TwoSum {
	 public int[] twoSum(int[] numbers, int target) {
	        //declare the variables
	        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	        //pass the input to the hashmap
	        for(int i=0; i<numbers.length;i++){
	            map.put(numbers[i],i);
	        }
	        //logic to check the two sum
	        for(int i=0; i<numbers.length; i++){
	            int difference = target - numbers[i];
	            if(map.containsKey(difference)&&map.get(difference)!=i){
	                return new int[] {i,map.get(difference)};
	            }
	        }
	        throw new IllegalArgumentException("no two sum solution");
	        
	    }

	
	
	@Test
	public void Test() {
		int target = 9;
		int[] nums = {2,7,11,15},expectedresult = {0,1};
		assertTrue(Arrays.equals(expectedresult, twoSum(nums,target)));
	}
	
}

