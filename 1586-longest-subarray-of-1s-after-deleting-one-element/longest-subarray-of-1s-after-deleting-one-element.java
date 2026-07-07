class Solution {
    public int longestSubarray(int[] nums) {

        int ans = 0;


        for(int i=0 ; i < nums.length ; i++){

            int zero_count = 0 ;

            for(int j =i ; j < nums.length ; j++){

                if(nums[j] == 0){

                    zero_count++;
                }
                if(zero_count <= 1){

                    ans = Math.max(ans, j-i);
                }  else{

                    break;
                }
            }
        }

        return ans;
        
    }
}