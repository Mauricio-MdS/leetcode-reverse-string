class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }
}