class Solution {
    String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) {
            List<String> base = new ArrayList<>();
            return base;
        }
        
        //char ch = digits.charAt(0);
        String res = digits.substring(1);
        List<String> mres = letterCombinations(res);
        String codesForEach = keypad[digits.charAt(0) - '0'];
        if(mres.isEmpty())mres.add("");  
        for(int i = 0;i<codesForEach.length();i++) {
            //String chCode = (String)codesForEach.charAt(i);
            for(String mresvalue: mres) {
                ans.add(codesForEach.charAt(i)+mresvalue);
            }
        }
        return ans;
    }
}