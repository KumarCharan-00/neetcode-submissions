class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int num: nums) {
            Integer k = arr.get(num);
            if (k != null) {
                arr.put(num, k + 1); 
                return true;
            } else arr.put(num, 1);
        }
        return false;
    }
}
