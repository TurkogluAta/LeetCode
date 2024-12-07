/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2; // To prevent overflow

            if (isBadVersion(mid)) {
                right = mid; // First bad version can be before here
            } else {
                left = mid + 1; // First bad version from here on out
            }
        }
        
        // When left == right the first bad version is found
        return left;
    }
}