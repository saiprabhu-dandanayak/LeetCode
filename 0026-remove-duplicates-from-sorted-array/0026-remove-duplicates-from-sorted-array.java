class Solution {
    public int removeDuplicates(int[] nums) {
        
        //keeping the first pointer at the starting index and allowing j to travel the array
        int i= 0;
        for( int j= 0 ; j<nums.length;j++){
           
            if(nums[i]!=nums[j]){
                
                nums[i+1]=nums[j];
                i++;
            }
        }
        
        return i+1;
    }
}