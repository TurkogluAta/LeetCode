class Solution {
    public int firstUniqChar(String s) {

        // Step 1: Counting the frequencies of characters
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            map.put(temp , map.getOrDefault(temp , 0) + 1);
        }

        // Step 2: Find the first non-repeating character
        for(int i = 0; i < s.length(); i++ ){
            char temp2 = s.charAt(i);
            if(map.get(temp2) == 1){
                // Return the index of the first non-repeating character
                return i;
            }
        }
        // If there are no non-repeating characters, return -1
        return -1;
    }
}