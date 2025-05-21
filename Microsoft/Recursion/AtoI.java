class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int sign = 1;
        int i = 0;
        char arr[] = s.toCharArray();
        while (i < s.length() && arr[i] == ' ')
            i += 1;

        if (i < s.length()) {
            if (arr[i] == '-') {
                sign = -1;
                i++;
            } else if (arr[i] == '+') {
                i++;
            }
        }

        while (i < s.length() && 0 <= ((int) arr[i] - (int) ('0')) && ((int) arr[i] - (int) ('0')) <= 9) {
            if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && arr[i] - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + ((int) arr[i] - (int) ('0'));
            i = i + 1;
        }
        return sign * res;

    }
}