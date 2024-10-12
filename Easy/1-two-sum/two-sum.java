class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            
            // If complement is present, result is found
            if(map.containsKey(comp)) {
                return new int[] {map.get(comp), i};
            }
            
            // Add current element to hashmap
            map.put(nums[i] , i);
        }
        
        throw new IllegalArgumentException("No solution found");
    }
}