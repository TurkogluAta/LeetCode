class Solution {
    public int singleNumber(int[] nums) {
        
        // Initialize a result variable for the XOR operation
        int result = 0;
        
        // We do XOR with all numbers
        for (int num : nums){
            
            // We combine each number with the XOR operator
            result ^= num;
        }
        // The only number left will be result
        return result;
    }
}