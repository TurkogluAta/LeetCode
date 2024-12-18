class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1; // If there is only 1 digit
        if (n == 2) return 2; // If there is only 2 digit

        int prev1 = 2; // Ways to go up to (n-1) digits
        int prev2 = 1; // Ways to go up to (n-2) digits
        int current = 0;

        // Calculate paths for each step with loop
        for(int i = 3; i <= n; i++){
            current = prev1 + prev2; // Total paths
            prev2 = prev1; // (n-2) -> (n-1)
            prev1= current; // (n-1) -> current
        }

        return current; // Ways to reach the last digit
    }
}