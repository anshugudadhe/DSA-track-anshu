class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
           
            max_sum=Math.max(curr,max_sum);
        }
        return max_sum;

    }
}
