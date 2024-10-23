class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length(); 
        int n = needle.length();   

        // If needle is longer than haystack, or if needle is empty, return -1
        if (n > m || n == 0) {
            return -1;
        } 
        
        else {
            // Iterate through the haystack, checking each substring of length n
            for (int i = 0; i <= (m - n); i++) {
                
                // Extract the substring from haystack of length n starting at index i
                String SubHay = haystack.substring(i, i + n);
                
                // If the substring matches the needle, return the current index i
                if (SubHay.equals(needle)) {
                    return i;
                }
            }
        }

        // If no match is found, return -1
        return -1;
    }
}