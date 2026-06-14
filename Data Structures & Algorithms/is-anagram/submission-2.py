from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        counter = [0] * 26
        for c in s:
            counter[ord(c) - 97] += 1
        
        for c in t:
            counter[ord(c) - 97] -= 1

        return not any(count != 0 for count in counter)