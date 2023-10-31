package com.practice.leetcode.problems;

public class MaxSumOfSubArray {

public static void main(String[] args) {
	
	int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
	
	System.out.println(maxSubArray(nums));
	
	}
		 static int maxSubArray(int[] nums) {
			
			int maxsofar = nums[0];
			int currentsum = nums[0];
			
			for(int i=1 ; i < nums.length; i++)
				
				{
				if(currentsum < 0) {
				
					currentsum = 0;
				}
				
				currentsum = currentsum + nums[i];
				if(currentsum > maxsofar) {
					maxsofar = currentsum;
				}
			}
			return maxsofar;
		}
		
 }	


