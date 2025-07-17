/**
 * *************************************************
 * *************************************************          LEETCODE PROBLEM - 53 . MAXIMUM SUBARRAY
 * *************************************************
 
 
 Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104*/

/* USED KADANES ALGORITHM */

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 0;
        int max_sum =nums[0];
        int current_max_sum = nums[0];
        for(int i=1;i<n;i++){
            current_max_sum = Math.max(current_max_sum + nums[i] , nums[i]); //MAIN LOGIC (KADANES ALGORITHM)
            max_sum = Math.max(max_sum , current_max_sum);
        }
        return max_sum;
    }
}
