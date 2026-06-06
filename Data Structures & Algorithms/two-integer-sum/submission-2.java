class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(i, nums[i]);
        }

        List<Map.Entry<Integer, Integer>> entries = map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toList());

        int left=0, right=nums.length-1;

        while (left < right) {
            if (entries.get(left).getValue() + entries.get(right).getValue() == target) {
                int[] result = entries.get(left).getKey() < entries.get(right).getKey() 
                ? new int[]{entries.get(left).getKey(), entries.get(right).getKey()} : new int[]{entries.get(right).getKey(), entries.get(left).getKey()};
                return result;
            }

            if (entries.get(left).getValue() + entries.get(right).getValue() < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}