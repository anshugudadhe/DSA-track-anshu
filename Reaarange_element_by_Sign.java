class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[]= new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        int p=0;
        int n=0;
        int x=0;
        int y=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[p]=nums[i];
                p++;
            }else{
                neg[n]=nums[i];
                n++;
            }
        }
        for(int z=0;z<nums.length;z++){
            if(z%2==0){
                nums[z]=pos[x];
                x++;
            }else if(z%2==1){
                nums[z]=neg[y];
                y++;
            }
        }
        return nums;
    }
}
