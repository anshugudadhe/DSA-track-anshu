//Leetcode two sum Problem
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists in map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (though problem guarantees one solution)
        return new int[] {};
    }
}
