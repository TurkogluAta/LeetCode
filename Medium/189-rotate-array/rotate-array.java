class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        // Ensure k is within the bounds of the array length
        k = k % n;
        
        // Reverse the entire array
        reverseArray(nums, 0, n-1);
        // Reverse the first k elements
        reverseArray(nums, 0, k-1);
        // Reverse the remaining elements
        reverseArray(nums, k, n-1);
    }
    
    // Reverse the array between indices start and end
    void reverseArray (int[] nums, int start, int end){
        for (int i = start; i < end; i++, end--) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
        }
    }
}