class Solution {
    public boolean isPowerOfThree(int n) {
        int x = n;
        while (x>=3){
            if(x%3==0){
            x=x/3;
        }else{
            return false;
        }
        }
       if(x!=1){
        return false;
       }
       return true;

        }
    }
