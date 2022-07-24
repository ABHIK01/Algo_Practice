class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int j = matrix[0].length -1;
         int i = 0;
    while(j >= 0 && i < row  ) {
        if(matrix[i][j]  == target ){
            return true;
        }  if(matrix[i][j] < target){
            i++;
        } else {
            j--;
        }
    }
    return false;
        
    }
}