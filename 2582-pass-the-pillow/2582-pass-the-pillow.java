class Solution {
    public int passThePillow(int n, int time) {
        
        int direction = 1;
        int current = 1;
        
        int var = 0;
        while(var < time) {
            current += direction;
            if(current == 1) {
                direction = 1;
            }
            
            if(current == n){
                direction = -direction;
            }
            var++;
            
        }
        
        return current;
        
    }
}