package easy;

/**
 * ~ @created 29/11/2023
 * ~ @project_name leed_code_problems
 * ~ @author kurbanov
 **/
public class MajorityElementSolution {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Voting Phase
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        // Verification Phase
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is the majority element
        if (count > nums.length / 2) {
            return candidate;
        }

        // This should not happen given the problem constraints
        return -1; // No majority element found
    }
}
