class Solution {
    public int maxArea(int[] heights) {
        int maxAmount = 0;

        int left=0, right=heights.length-1;

        while (left<right) {
            int area = Math.min(heights[left], heights[right])*(right-left);
            maxAmount = Math.max(area, maxAmount);

            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }

        return maxAmount;
    }
}
