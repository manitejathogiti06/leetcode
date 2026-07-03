class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        // create 2D arrays


        int[][] pair = new int[n][2];

        for(int i=0; i < n ; i++){
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }

        // sort the 2D array
        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));


        
        int left = 0;
        int right = nums.length -1;

        while(left < right){

            int sum = pair[left][0] + pair[right][0];

            if(sum == target){
                return new int[]{pair[left][1], pair[right][1]};


            }else if(sum < target){
                left ++;
            
            } else{

                right --;
            }
        }
        return new int[] {-1,-1};

    }
}





