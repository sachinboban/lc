/**
 * Compilation: javac two_sum.java
 * Execution:   java two_sum
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 *
 * % java two_sum 2 7 11 15 9
 * 0, 1
 *
 * Assumptions:
 *  1) Each input would have exactly one solution
 *  2) Does not use the same number twice;
 *
 * Link: https://leetcode.com/problems/two-sum/
 *
 */


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        int size;
        int[] soln = new int[]{-1, -1};

        size = nums.length;

        for (i = 0; i < size; ++i) {
            for (j= i+1; j < size; ++j) {
                if (nums[i] + nums[j] == target) {
                    soln[0] = i;
                    soln[1] = j;
                    return soln;
                }
            }
        }

        return soln;
    }
}

public class two_sum {
    public static void main(String[] args) {
        int num_args;
        int i;
        int two_sum[];
        int[] result;
        Solution soln = new Solution();

        num_args = args.length;
        if (num_args < 3) {
            System.out.println("Insufficient arguments");
            return;
        } else {
            two_sum = new int[num_args - 1];

            for (i = 0; i < (num_args - 1); ++i) {
                two_sum[i] = Integer.parseInt(args[i]);
            }

            result = soln.twoSum(two_sum, Integer.parseInt(args[num_args - 1]));
            System.out.println(result[0] + ", " + result[1]);
        }
    }
}
