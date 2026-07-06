class Solution {
    public int minSubArrayLen(int target, int[] nums) {


        int left = 0 ;

        int Window_sum = 0;

        int minLength = Integer.MAX_VALUE;

        for( int right = 0 ;  right < nums.length ; right++){

            Window_sum = Window_sum + nums[right];



                    // shrink the  window while the sum is at least the target
            while( Window_sum >= target){

                minLength = Math.min(minLength , right - left + 1);

                Window_sum = Window_sum - nums[left];

                left++;


            }


        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLength;
}



        
    }
}