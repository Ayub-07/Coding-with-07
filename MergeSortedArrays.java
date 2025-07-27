/**
 * ***************************************************
 * ***************************************************            LEETCODE PROBLEM - 88 . MERGE SORTED ARRAYS
 * ***************************************************
 * 
 You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
 */
class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;        //Pointer 1 at the last "non-zero" number of nums1
        int j = n-1;        //Pointer 2 at the last element of nums2
        int k = m + n -1;   //Pointer 3 at the last element of nums1 (last "0")
        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){  // If element of first array is greater than second array.
                nums1[k] = nums1[i];          // Moving that element to the right (replacing with 0).
                i--; 
            }
            else{
                nums1[k] = nums2[j];          // If vice versa then just replace the 0 with second array's element
                j--;
            }
            k--; // Keep decrementing (m+n-1) wala pointer in every Iteration.
        }
    }
}