class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        s = set(nums)
        if target in s :
            return True
        else:
            return False
            
