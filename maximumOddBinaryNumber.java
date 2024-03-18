//import java.util.*;

class Solution {
    public static String maximumOddBinaryNumber(String s) {
        // Count the number of '1's in the input string
        int onesCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onesCount++;
            }
        }

        // Construct the maximum odd binary number
        StringBuilder result = new StringBuilder();
        
        // Add onesCount - 1 '1's at the beginning
        for (int i = 0; i < onesCount - 1; i++) {
            result.append('1');
        }

        // Add '0's to fill until the second to the last position
        int zerosCount = s.length() - onesCount;
        for (int i = 0; i < zerosCount; i++) {
            result.append('0');
        }

        // Ensure the number is odd
        if (onesCount > 0) {
            result.append('1');
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Runtime 1 ms
        // Beats 100.00% of users with Java
        String res = maximumOddBinaryNumber("010");
        System.out.println(res);
    }
}