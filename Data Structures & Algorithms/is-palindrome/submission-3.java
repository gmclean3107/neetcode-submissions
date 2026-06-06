class Solution {
    public boolean isPalindrome(String s) {
        int left=0, right=s.length()-1;

        while (left < right) {
            if (!String.valueOf(s.charAt(left)).toLowerCase().matches("[a-z0-9]")) {
                left++;
                continue;
            }
            if (!String.valueOf(s.charAt(right)).toLowerCase().matches("[a-z0-9]")) {
                right--;
                continue;
            }

            if (!String.valueOf(s.charAt(left)).toLowerCase().equals(String.valueOf(s.charAt(right)).toLowerCase())) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
