class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;

        for (int i=0; i< matrix.length; i++) {
            int right=matrix[i].length-1;
            if (matrix[i][left] <= target && matrix[i][right] >= target) {
                while(left <= right){
                    int mid = left + ((right-left)/2);

                    if (matrix[i][mid] < target) {
                        left = mid+1;
                    } else if (matrix[i][mid] > target) {
                        right = mid-1;
                    } else {
                        return true;
                    }
                }


            }
        }
        return false;
    }
}
