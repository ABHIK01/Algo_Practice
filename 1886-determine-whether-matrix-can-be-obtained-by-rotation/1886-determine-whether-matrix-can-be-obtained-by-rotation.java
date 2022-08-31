class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int count = 0;count<4;count++) {
            if(same(mat,target)){
                return true;
            }
            rotate(mat);
        }
        
        return false;
    }
    
    public boolean same(int[][] mat, int[][] target) {
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat.length;j++) {
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
     public void rotate(int[][] mat){
         transpose(mat);
        reflect(mat); 
     }
     public void transpose(int[][] matrix){
        int length = matrix.length;
        for(int i = 0;i<length;i++) {
            for(int j = i+1;j<length;j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
    
    public void reflect(int[][] matrix) {
        int length = matrix.length;
        for(int i = 0;i<length;i++ ){
            for(int j = 0;j<length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-j-1];
                matrix[i][length-j-1] = temp;
            }
        }
    }
    
}