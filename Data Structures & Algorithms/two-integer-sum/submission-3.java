class Solution {
    public int[] twoSum(int[] nums, int target) {
        var z_map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer xIndex = z_map.get(target - nums[i]);
            if (xIndex != null) {
                return new int[] {(int) xIndex, i};
            }
            z_map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
