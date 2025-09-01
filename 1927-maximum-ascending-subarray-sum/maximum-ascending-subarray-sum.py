class Solution(object):
    def maxAscendingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s=nums[0]
        m=0
        for i in range(1,len(nums)):
            if nums[i]<=nums[i-1]:
                m=max(s,m)
                s=0
            s+=nums[i]
        m=max(s,m)
        return m    