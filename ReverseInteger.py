class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        sign = -1 if x < 0 else 1
        a = abs(x)
        rev = 0
        while a != 0 :
            val = a % 10
            rev = rev * 10 + val
            a //= 10
        if rev > 2**31 or rev < -2**31:
            return 0
        return rev * sign