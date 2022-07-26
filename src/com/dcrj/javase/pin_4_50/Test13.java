package com.dcrj.javase.pin_4_50;

import java.util.HashMap;
import java.util.Map;

/**  
 * @ClassName: Test13
 * @Description: TODO
 * @author pin
 * @date 2022-05-10 03:27:34 
 */

public class Test13 {
	public static int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
	        for (int i = 0; i < nums.length; ++i) {
	            if (hashtable.containsKey(target - nums[i])) {
	                return new int[]{hashtable.get(target - nums[i]), i};
	            }
	            hashtable.put(nums[i], i);
	        }
	        return new int[0];
	    }

	public static void main(String[] args) {
		int[] arr = {11,22,66,44};
		int num = 66;
		for(var i:twoSum(arr,num)) {
			System.out.println(i);
		}
		
		
	}

}
