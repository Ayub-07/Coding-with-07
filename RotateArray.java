/*
*****************************************                                                                *********************************
*****************************************      LEETCODE PROBLEM - 189 ROTATE ARRAY             *********************************
*****************************************                                                                *******************************
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 
*/

/*   ----------------------------------------------USING REVERSAL APPROACH-------------------------------------------------------------- */

class Solution {
    public void reverse (int arr[] , int start , int end){ // FUNCTION TO REVERSE THE ARRAY
        while(start<end){
            int temp = arr[start]; // SWAPPING
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n)
            k = k % n; // IF K IS GREATER THAN N
        // REVERSAL ALGORITHM
        reverse(nums,0,n-1); // REVERSE THE WHOLE ARRAY
        reverse(nums,0,k-1); // REVERSE FIRST K ELEMENTS
        reverse(nums,k,n-1); // REVERSE THE REMAINING N-K ELEMENTS
    }
}