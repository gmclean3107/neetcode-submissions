class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            int left=i+1, right=nums.length-1;

            while (left < right) {
                if (nums[left]+nums[right] + nums[i] == 0) {
                    if (!list.contains(List.of(nums[i], nums[left], nums[right]))){
                        list.add(List.of(nums[i], nums[left], nums[right]));
                    }
                }
                if (nums[left]+nums[right] + nums[i] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;
    }
}
