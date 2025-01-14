/**Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3. 
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            for(int j=i+1;j<nums.length;j++){
            if(nums[j]==temp)
             return true;
            } 
        }
        return false;
    }
}