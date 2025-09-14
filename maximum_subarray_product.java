class Solution {
    public int maxProduct(int[] nums) {
        int p =nums[0];
        int max =nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
             int x=nums[i];
            if(x<0){
                     int temp=max;
                     max=min;
                     min=temp;
            }
          
            max= Math.max(x,max * x);
            min =Math.min(x,min * x);
            p = Math.max(p,max);
        }
        return p;
    }
}
