class Solution {
    public static void reverse(int m[]){
        for(int i=0;i<m.length/2;i++){
            int temp=m[i];
            m[i]=m[m.length-i-1];
            m[m.length-i-1]=temp;
        }
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
}
