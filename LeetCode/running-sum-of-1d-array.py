class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        tmp = 0
        out = []
        for i in nums:
            tmp += i
            out.append(tmp)
        return out