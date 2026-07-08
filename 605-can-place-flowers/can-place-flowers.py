class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        for i in range(len(flowerbed)):
            is_left_empty = i == 0 or flowerbed[i - 1] == 0
            is_right_empty = i == len(flowerbed) - 1 or flowerbed[i + 1] == 0

            if flowerbed[i] == 0 and is_left_empty and is_right_empty:
                flowerbed[i] = 1
                n -= 1

            if n <= 0:
                return True
        return False
