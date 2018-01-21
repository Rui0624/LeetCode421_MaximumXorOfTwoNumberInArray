
import java.util.Set;  
import java.util.HashSet;  
import java.util.Iterator;

public class Solution {
	public int findMaximumXOR(int[] nums) {
        int res = 0;
        int mask = 0;
        for(int i = 31; i>= 0; i--){
        	mask |= (1 << i);
        	Set<Integer> set = new HashSet<Integer>();
        	for(int num : nums)
        		set.add(num & mask);
        	int t = res | (1 << i);
        	for(int prefix : set){
        		if(set.contains(t ^ prefix)){
        			res = t;
        			break;
        		}
        	}

        }
        return res;
    }
}
