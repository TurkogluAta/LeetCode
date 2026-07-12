class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        hashmap = {}

        for num in arr:
            if num in hashmap:
                hashmap[num] += 1
            else:
                hashmap[num] = 1

        values = list(hashmap.values())
        unique_values = set(hashmap.values())

        return len(values) == len(unique_values)