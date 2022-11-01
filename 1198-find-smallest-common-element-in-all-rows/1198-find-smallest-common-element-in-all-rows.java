class Solution {
    public int smallestCommonElement(int[][] mat) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int row = mat.length;
        int column = mat[0].length;
        if(row == 1) {
            return mat[0][0];
        }
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                int val = mat[i][j];
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }
        
        int smallestValue = Integer.MAX_VALUE;
        for(int value :map.keySet()){
            if(map.get(value) == row && value < smallestValue ){
                smallestValue = value;
            }
        }
        
        return smallestValue != Integer.MAX_VALUE ? smallestValue  : -1;
    }
}