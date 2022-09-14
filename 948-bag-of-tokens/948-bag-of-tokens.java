class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int left = 0,right = tokens.length - 1;
        
        int currentScore = 0;
        int maxScore = 0;
        while(left <= right){
            if(tokens[left] <= power) {
                power = power - tokens[left];
                currentScore += 1;
                maxScore = Math.max(maxScore,currentScore);
                left++;
            } else if(currentScore >= 1){
                power = power + tokens[right];
                currentScore -=1;
                right--;
            }
            else {
                break;
            }
        }
        
        return maxScore;
        
        
    }
}