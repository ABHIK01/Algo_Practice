class Solution {
    public long countGood(int[] nums, int k) {
      long ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int left = 0;
        int pairs = 0;
        for(int right = 0;right < nums.length;right++){
			// Expand the right side till we get pairs == k
            pairs += hm.getOrDefault(nums[right],0); // Note that we only increment pair based on prev value this takes care of 
			// case for count(nums[right) = 1 and we cant make pair from this count
            hm.put(nums[right], hm.getOrDefault(nums[right],0)+1);
            System.out.println(nums[right] + " " + pairs);
            while(pairs >= k){ // We contract window from left side till we have an invalid window
                hm.put(nums[left],hm.get(nums[left])-1);
                pairs -= hm.get(nums[left]);
                left += 1;
            }
            ans += left; // The left pointer gives us the number of valid pairs in the window [left,right]
			//Note : The siding window we are maintaining here has the min num of elements in range [left,right] 
			//with atleast k pairs, if we extend our window to the left it will by default contain the minimum k pairs + may contain more
			//hence if [left, right] is valid that means [left-1,right] is also valid, [left-2, right] is also valid. 
			//Thus we just add the left pointer to ans as it will contains the range from [0,left-1] which is forming the valid pair with right
        }
        return ans;  
    }
}