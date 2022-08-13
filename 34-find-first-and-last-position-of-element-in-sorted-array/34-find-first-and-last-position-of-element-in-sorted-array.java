class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        int[] result = new int[] {-1,-1};
        if(nums.length == 0) {
            return result;
        }
        result[0] = binarySearch(nums,target,true);
        if(result[0] != -1) {
            result[1] = binarySearch(nums,target,false);
        }
        return result;
        
    }
    
    public int binarySearch(int[] nums,int target,boolean flag) {
        int start = 0,end = nums.length-1;
        int index = -1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                index = mid;
                if(flag) {
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
            
            else if(nums[mid] < target) {
                start++;
            }else {
                end--;
            }
        }
        return index;
    }
}