class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> z_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer xIndex = z_map.get(target - nums[i]);
            if (xIndex != null) {
                return new int[] {(int) xIndex, i};
            }
            z_map.put(nums[i], i);
        }
        return new int[] {};
    }
}
