class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null|| strs.length==0){
            return "";
        }
            int minlength = Integer.MAX_VALUE;
        for(String s : strs){
            minlength = Math.min(minlength,s.length());
        }

        StringBuilder prefix = new StringBuilder();
        for(int i=0; i<minlength;i++){
            char currentChar = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(currentChar != strs[j].charAt(i)){
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
        }
        return prefix.toString();
    }
}
