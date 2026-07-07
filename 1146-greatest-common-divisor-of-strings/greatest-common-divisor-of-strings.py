class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        
        len1 = len(str1)
        len2 = len(str2)
        
        if str1 + str2 == str2 + str1:
            common_length = gcd(len1, len2)
            common_pattern = str1[:common_length]
            return common_pattern
        else:
            return ""
            
        