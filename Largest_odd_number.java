class Solution {
    public String largestOddNumber(String num) {
        int count=0;
        StringBuilder sb =new StringBuilder("");
            
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='1'||num.charAt(i)=='3'||num.charAt(i)=='5'||num.charAt(i)=='7'||num.charAt(i)=='9' ){
                count=i;
                break;
            }else{
                count=-1;
            }
        }
        if(count==-1){
            return sb.toString();
        }
        for(int j=0;j<=count;j++){
            sb.append(num.charAt(j));
        }
       return sb.toString();
      
    }
}
