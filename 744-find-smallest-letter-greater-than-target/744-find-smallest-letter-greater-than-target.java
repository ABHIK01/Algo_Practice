class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target < letters[0] || target >= letters[letters.length-1]){
            return letters[0];
        }
        int low = 0,high = letters.length-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(letters[mid] <= target) {
                low = mid+1;
                
            }else {
                high = mid-1;
            }
        }
        return letters[low];
        
    }
}