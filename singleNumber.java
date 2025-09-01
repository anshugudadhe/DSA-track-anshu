class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        for(int i=0;i<nums.length;i++){
             if(i==nums.length-1){
               n=nums[i];
            }else if(nums[i]==nums[i+1]){
                i++;
              continue;
            }else{
            n=nums[i];
            break;
            }
        }
        return n;
    }
}
