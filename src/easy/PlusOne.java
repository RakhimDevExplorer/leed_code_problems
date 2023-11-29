package easy;

import java.util.Arrays;

/**
 * ~ @created 29/11/2023
 * ~ @project_name leed_code_problems
 * ~ @author kurbanov
 **/
public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }
    public  static int[] plusOne(int[] digits) {
        int n = digits.length;
        //this is array =  n

        // Iterate from the least significant digit to the most significant digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;

            // Check if there is a carry
            if (digits[i] < 10) {
                // No carry, we are done
                return digits;
            } else {
                // Carry, set the current digit to 0 and continue to the next higher digit
                digits[i] = 0;
            }
        }

        // If we reach here, it means there is a carry to the most significant digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the most significant digit to 1
        return result;
    }
}
