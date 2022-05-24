class Solution {
    public String removeDigit(String number, char digit) {
        int index = 0,length = number.length();
        for(int i = 0;i<length;i++) {
            if(number.charAt(i) == digit) {
                index = i;
                if( i < length-1 && digit < number.charAt(i+1) ){
                    break;
                }
            }
        }
        
        number = number.substring(0,index) + number.substring(index+1);
        return number;
    }
}