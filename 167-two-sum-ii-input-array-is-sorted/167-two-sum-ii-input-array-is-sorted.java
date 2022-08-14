class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<numbers.length;i++) {
            if(map.containsKey(target-numbers[i])){
                result[1] = i+1;
                result[0] = map.get(target-numbers[i])+1;
                return result;
            }
            else{
                map.put(numbers[i],i);
            }
        }
        return result;
        */
        
       int start = 0,end = numbers.length-1;
        while(start <= end) {
            int sum = numbers[start] + numbers[end];
            if(target>sum) {
                start++;
            } else if(target < sum) {
                end--;
            }else {
                return new int[] {start+1,end+1};
            }
            
        }
        return new int[] {-1,-1};
        
        
    }
}