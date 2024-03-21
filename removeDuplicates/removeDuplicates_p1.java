
package removeDuplicates;

class Solution {
    /** TASK:
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears
    only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
    
    Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
    Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums 
    initially. The remaining elements of nums are not important as well as the size of nums.
    
    Return k.*/
    public int removeDuplicates(int[] nums) {
        /**
        Runtime 1 ms
        Beats 74.79% of users with Java
         */
        if (nums.length == 0) return 0;
        int insertPos = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        return insertPos;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{1,2,2,3};
        System.out.println(s.removeDuplicates(nums));
    }
}