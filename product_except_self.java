class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
       int num[] = new int[n];
       int left=1;
        for(int i=0;i<n;i++){
            num[i]=left;
            left = left*nums[i];
              
              }
              int right=1;
              for(int i=n-1;i>=0;i--){
                num[i]*=right;
                right*=nums[i];
              }
       return num;
    }
}
