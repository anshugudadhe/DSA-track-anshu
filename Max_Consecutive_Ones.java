class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int n=0;
        int count=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && n==0){//sta
                max= Math.max(max , i-n);
                n=i;
                count++;
            }else if(nums[i]==0){
                max= Math.max(max , i-n-1);
                n=i;
                count++;
             }else if(nums[i]==1 && i==nums.length-1){
                max=Math.max(max , i-n);
            }
        }
        if(count==nums.length){
            return 0;
        }else if(count==0){
            return nums.length;
        }
        return max;
    }
}
