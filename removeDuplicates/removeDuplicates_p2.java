package removeDuplicates;

class Solution {
    /** TASK:
    Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears
    at most twice. The relative order of the elements should be kept the same.

    Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the 
    first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements 
    of nums should hold the final result. It does not matter what you leave beyond the first k elements.

    Return k after placing the final result in the first k slots of nums.

    Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.*/
    public int removeDuplicates(int[] nums) {
        /*Runtime 3 ms
        Beats 7.68% of users with Java*/
        
        if (nums.length == 0) return 0;
        int insertPos = 1;
        int count = 1;

        System.out.println();
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }else{
                count = 1;
            }
            if (count <= 2) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
            
        }
        
        return insertPos;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{1,2,2,3,3,3,3,4,4,5,5,5,5,5};
        // Res -> 1,2,2,3,3,4,4,5,5
        System.out.println(s.removeDuplicates(nums));
    }
}