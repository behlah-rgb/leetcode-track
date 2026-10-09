// class Solution {
//     public int myAtoi(String s) {
//         StringBuffer sb = new StringBuffer();
//         boolean firstNotFound = true;
//         for (int i = 0; i < s.length(); i++) {
//             char temp = s.charAt(i);
//             if (i == 0 && temp == '-') sb.append(temp);
//             else if ((temp == '0' && firstNotFound) || temp == ' ') continue;
//             else if (!Character.isDigit(temp)) break;
//             else { // if (Character.isDigit(temp))
//                 sb.append(temp);
//                 firstNotFound = false;
//             }
//         }
//         if (sb.length() == 0) return 0;
//         return Integer.parseInt(sb.toString());
//     }
// }
class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int index = 0;
        int n = s.length();

        // Step 1: Skip leading whitespace
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        if (index == n) {
            return 0;
        }

        // Step 2: Determine sign
        int sign = 1;
        char firstChar = s.charAt(index);
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            sign = -1;
            index++;
        }

        // Step 3 & 4: Convert digits and handle overflow
        int result = 0;
        while (index < n) {
            char ch = s.charAt(index);
            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';

            // Check for overflow before multiplying by 10
            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
}