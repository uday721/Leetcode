import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Zigzag {

    public String convert(String s, int numRows) {
    	char[] c=s.toCharArray();
    	int length=c.length;
    	StringBuffer[] sb = new StringBuffer[numRows];
    	for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
    	 int i = 0;
    	/* sb[0].append(c[1]);
    	  System.out.println(sb[0]);*/
    	 
    	    while (i < length) {
    	        for (int idx = 0; idx < numRows && i < length; idx++) {
    	            sb[idx].append(c[i++]);
    
    	        }
	          
    	        for (int idx = numRows-2; idx >= 1 && i < length; idx--) 
    	            sb[idx].append(c[i++]);
    	    }
    	    for (int idx = 1; idx < sb.length; idx++)
    	        sb[0].append(sb[idx]);
    	    return sb[0].toString();
    			
	}
    
    @Test
    public void testConvert() {
    	assertEquals("ABDC", convert("ABCD", 3));
    }

}
