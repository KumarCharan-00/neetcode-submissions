class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> zMap = new HashMap<>();
        // Streams based solution
        return IntStream.range(0, nums.length)
                    .filter(i -> {
                        if (zMap.containsKey(target - nums[i])) {
                            return true;
                        }
                        zMap.put(nums[i], i);
                        return false;
                    })
                    .mapToObj(i -> new int[] {zMap.get(target - nums[i]), i})
                    .findFirst()
                    .orElse(new int[] {});
    }
}
