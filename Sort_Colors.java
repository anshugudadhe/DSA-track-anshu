class Solution {
    public void sortColors(int[] nums) {
        int count=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else if(nums[i]==1){
                s++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i>=0 && i<count){
                nums[i]=0;
            }else if(i>=count && i<s+count){
                nums[i]=1;
            }else{
                nums[i]=2;
            }
        }
    }
}
