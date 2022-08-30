class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int column = mat[0].length;
        
        Map<Integer,Queue<Integer>> diagonals = new HashMap<>();
        
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++) {
                diagonals.putIfAbsent(i-j,new PriorityQueue<>());
                diagonals.get(i-j).add(mat[i][j]);
            }
        }
        
        for(int i = 0;i<row;i++ ){
            for(int j = 0;j<column;j++){
                mat[i][j] =  diagonals.get(i-j).remove();
            }
        }
        
        return mat;
        
    }
}