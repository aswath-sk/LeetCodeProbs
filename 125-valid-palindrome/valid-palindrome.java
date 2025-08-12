class Solution {
    public boolean isPalindrome(String s) {
        String t = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                t += Character.toLowerCase(ch);
            }
        }

        int left = 0, right = t.length() - 1;
        while (left < right) {
            if (t.charAt(left) != t.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
