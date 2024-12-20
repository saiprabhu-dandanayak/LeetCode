class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum = 0;
        int leftSum = 0;

        //total sum of array
        for (int num : nums) {
            totalSum += num;
        }

      
        // updaeting the leftSum value and checking it with rightSum
        for (int i = 0; i < nums.length; i++) {
            
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
        
    }
}