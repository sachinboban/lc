/**
 * Compilation: javac TwoSum.java
 * Execution:   java TwoSum
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 *
 * % java TwoSum 2 7 11 15 9
 * 0, 1
 *
 * Assumptions:
 *  1) Each input would have exactly one solution
 *  2) Does not use the same number twice;
 *
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Reference: https://www.geeksforgeeks.org/java-util-hashmap-in-java/
 *
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int complement;
        HashMap <Integer, Integer> map = new HashMap<>();

        // Insert (number, index) pair into has map
        for (i = 0; i < nums.length; ++i) {
            map.put(nums[i], i);
        }

        // Check whether the HashMap contains the complement
        for (i = 0; i < nums.length; ++i) {
            complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int numArgs;
        int i;
        int array[];
        int[] result;
        Solution soln = new Solution();

        numArgs = args.length;
        if (numArgs < 3) {
            System.out.println("Insufficient arguments");
            return;
        } else {
            array = new int[numArgs - 1];

            for (i = 0; i < (numArgs - 1); ++i) {
                array[i] = Integer.parseInt(args[i]);
            }

            result = soln.twoSum(array, Integer.parseInt(args[numArgs - 1]));
            System.out.println(result[0] + ", " + result[1]);
        }
    }
}
