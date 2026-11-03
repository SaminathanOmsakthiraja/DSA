class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        m = max(nums)
        count = 0
        for i in range(len(nums)):
            count += m - nums[i]
        return count