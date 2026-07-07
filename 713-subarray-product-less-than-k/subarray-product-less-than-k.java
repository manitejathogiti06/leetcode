class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {


        int left = 0;

        int product = 1;

        int count = 0 ;

        for(int right = 0 ; right < nums.length ; right++){

            // expand the window 

            product = product * nums[right];

             // shrink the window 

            while(product >= k){

                product = product / nums[left];
                left ++;

        

            }

            // count all subarrays    [10,5]  valid   its [10,5] and [5]  two sub arrays
            // so left =0 and right =1 1-0+1  =2 two sub arays 

            count = count + (right-left+1 ) ;


        }

        return count ;
    }



}