class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        ones_count = s.count('1')
        
        # For a string with exactly one '1', place it at the end
        if ones_count == 1:
            return '0' * (len(s) - 1) + '1'
        
        result = '1' * (ones_count - 1) + '0' * (len(s) - ones_count) + '1'
        
        return result


    #Runtime
    # 30 ms
    # Beats 93.92% of users with Python3
    maximumOddBinaryNumber('', "001")