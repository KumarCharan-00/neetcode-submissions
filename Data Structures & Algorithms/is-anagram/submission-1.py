from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        s_set = set(s)

        for ch in s_set:
            if s.count(ch) != t.count(ch): 
                return False
        
        return True