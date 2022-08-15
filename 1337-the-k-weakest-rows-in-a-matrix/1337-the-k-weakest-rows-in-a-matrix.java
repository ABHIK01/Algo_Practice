class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<mat.length;i++) {
            int count = getSolder(mat[i]);
            map.put(i,count);
            list.add(count);
        }
        Collections.sort(list);
        int[] arr = new int[k];
        int index = 0;
        for(int i = 0;i<k;i++) {
            for(Map.Entry<Integer,Integer> m:map.entrySet()) {
                if(list.get(i) == m.getValue()) {
                    arr[index++] = m.getKey();
                    map.remove(m.getKey(),m.getValue());
                    break;
                }
            }
        }
        return arr;
        
    }
    
    public int getSolder(int[] arr) {
        int count = 0;
        for(int i =  0;i<arr.length;i++) {
            if(arr[i] == 1) {
                count++;
            }
        }
        return count;
    }
}