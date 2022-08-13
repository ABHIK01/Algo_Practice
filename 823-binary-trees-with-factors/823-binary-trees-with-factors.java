class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Long> map = new HashMap<>();
        
      map.put(arr[0],1L);
        long ans = 1;
        for(int i = 1;i<arr.length;i++) {
            long count  = 1;
            for(int j = 0;j<i;j++) {
                if(arr[i] % arr[j] == 0 && map.containsKey(arr[i] / arr[j] )) {
                        count += map.get(arr[j]) * map.get(arr[i]/arr[j]);
                    
                }
            }
            map.put(arr[i],count);
            ans += count;
        }
          return (int)(ans%1000000007);
    }
  
}