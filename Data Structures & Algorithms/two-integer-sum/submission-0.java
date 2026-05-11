class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();


        for (int i =0; i<nums.length; i ++) {
          values.put(nums[i], i);
        }

        for (int i =0; i < nums.length; i++){
            int diff = target - nums[i];
            if (values.containsKey(diff) && values.get(diff) != i){
                return new int[]{i, values.get(diff)};
            }
        }
        return new int[0];
    }
}
