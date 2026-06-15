class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        z_map = {}
        for i, x in enumerate(nums):
            y = target - x
            if y in z_map:
                return [z_map[y], i]
            z_map[x] = i 
        
        return []