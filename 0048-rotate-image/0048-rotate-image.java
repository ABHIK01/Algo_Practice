class Solution {
    public void rotate(int[][] matrix) {
    tranpose(matrix);
    reflect(matrix);
        
        
    }
    
    void tranpose(int[][] matrix) {
        int length = matrix.length;
        for(int i = 0;i<length;i++) {
            for(int j = i+1;j<length;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
    
    void reflect(int[][] matrix) {
        int length = matrix.length;
        for(int i = 0;i<length;i++) {
             
            for(int j = 0;j<length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-j-1];
                matrix[i][length-j-1] = temp;
            }
        }
    }
}