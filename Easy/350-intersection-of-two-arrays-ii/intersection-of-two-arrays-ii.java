class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Fill the map with frequencies from nums1
        for(int i = 0; i < nums1.length; i++){
            int temp = nums1[i];
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        } 
        
        // Check for intersection with elements in nums2
        for(int j = 0; j < nums2.length; j++){
            int temp2 = nums2[j];

            // If the element exists in the map with a positive count, add it to the result
            if(map.containsKey(temp2) && map.get(temp2) > 0){
                result.add(temp2);
                
                // Decrease the frequency
                map.put(temp2 , map.get(temp2) - 1);
            }
        }
        
        // Convert the result list to an array
        int intersectArray [] = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            intersectArray[i] = result.get(i);
        }
        
        // Return the final result
        return intersectArray;
    }
}