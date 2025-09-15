class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int count=1;
        int n = nums.length;
        int limit=n/3;
        Arrays.sort(nums);
       
       
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                }else{
                    if(count>limit){
                    l.add(nums[i-1]);
                    }
                    count=1;
                }
            }
        
        if(count > limit){
            l.add(nums[n-1]);
        }
        return l;
        
    }
}
