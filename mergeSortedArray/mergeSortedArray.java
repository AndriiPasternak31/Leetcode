package mergeSortedArray;

// Not finished

class Solution {
    // You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
    // representing the number of elements in nums1 and nums2 respectively.

    // Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    // The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, 
    // nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are 
    // set to 0 and should be ignored. nums2 has a length of n.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
    }
    public static void main(String[] args) {
        
        int k = 0, i = 0, j = 0;
        int[] nums1 = new int[] {9,5,1,2};
        int[] nums2 = new int[] {3,12,7,8};
        int[] nums = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            // Compare elements of nums1 and nums2 and add the smaller one to the result
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++; // Move the pointer in nums1 forward
            } else {
                nums[k] = nums2[j];
                j++; // Move the pointer in nums2 forward
            }
            k++; // Move the pointer in the result array forward
        }

        // If there are remaining elements in nums1, add them to the result
        while (i < nums1.length) {
            nums[k] = nums1[i];
            i++;
            k++;
        }

        // If there are remaining elements in nums2, add them to the result
        while (j < nums2.length) {
            nums[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println("\n");
        for(int y = 0; y < nums.length; y++){
            System.out.println(nums[y]);
        }

    }
}
