/****************************************                                                            *****************************
 * **************************************   LEETCODE Qno - 1636 SORTED ARRAY BY INCREASING FREQUENCY *****************************
 * **************************************                                                         *****************************
 * **************************************                                                            *****************************
 * 
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

 

Example 1:

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
Example 3:

Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
 

Constraints:

1 <= nums.length <= 100
-100 <= nums[i] <= 100

*************************************** Since this is a leetcode question the code is based upon functional approach , if you want the full code (with scanning inputs and printing) you can checkout the -> "FrequencySort.java" above this file
***************************************
*************************************** */
import java.util.*;
class Solution {
    public int[] frequencySort(int[] nums) {
            Map<Integer,Integer> hmap = new HashMap<>();
            for(int num : nums){
                hmap.put(num,hmap.getOrDefault(num,0)+1);
            }
            List<Integer> ls = new ArrayList<>(hmap.keySet());
            Collections.sort(ls ,(a,b)->{
                if (!hmap.get(a).equals(hmap.get(b)))
                        return hmap.get(a)-hmap.get(b);
                return b-a; // here in leetcode it asked that ,  if the frequency of two elements is same then print in decreasing order , In "FrequencySort.java" problem they asked to print in Ascending order ... thats the only difference you can notice between these two problems. 
            });
            int ans[] = new int [nums.length]; // Frequency sorted array which we'll return 
            int idx = 0;
            for(int num : ls){
                int freq = hmap.get(num);
                while(freq--> 0){
                    ans[idx] = num;
                    idx++;
                }
            }
            return ans;
    }
}