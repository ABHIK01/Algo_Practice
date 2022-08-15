class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0;i<arr.length;i++) {
           map.put(arr[i],i);
       }
        
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]%2 == 0 && map.get(arr[i]/2) != null && map.get(arr[i]/2)!= i){
                return true;
            }
        }
        
        return false;
        
    }
}