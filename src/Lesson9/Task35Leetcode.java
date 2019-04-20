package Lesson9;

public class Task35Leetcode {
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i + 1;
            }
        }


        return nums.length;
    }


}