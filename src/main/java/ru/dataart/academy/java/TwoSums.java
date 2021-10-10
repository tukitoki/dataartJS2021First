package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > target) {
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] > target) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[j], nums[i]};
                }
            }
        }
        return new int[]{};
    }
}
