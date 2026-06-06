class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        int start=0, end=1;

        while (end < nums.length) {
            if (nums[start] == nums[end]) {
                return true;
            }
            start = end;
            end++;
        }
        return false;
    }
}