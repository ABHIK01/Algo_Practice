class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String log1,String log2) {
                String[] split1 = log1.split(" ",2);
                String[] split2 = log2.split(" ",2);
                boolean digit1 = Character.isDigit(split1[1].charAt(0));
                boolean digit2 = Character.isDigit(split2[1].charAt(0));
                
                if(!digit1 && !digit2) {
                    int comp = split1[1].compareTo(split2[1]);
                    if(comp != 0) {
                        return comp;
                    }
                    
                    return split1[0].compareTo(split2[0]);
                }
                
                if(digit1 && digit2) {
                    return 0;
                } else if(!digit1 && digit2){
                    return -1;
                } else {
                    return 1;
                }
                
            }
        };
        
        Arrays.sort(logs,comparator);
        return logs;
        
    }
}