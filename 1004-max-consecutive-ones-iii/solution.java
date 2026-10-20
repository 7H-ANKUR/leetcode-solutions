class Solution {
    public int longestOnes(int[] nums, int k) {
        int first=0;
        int zero=0;
        int maximum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;

            }
            while(zero>k){
                if(nums[first]==0){
                    zero--;
                }
                first++;
            }
            maximum=Math.max(maximum,i-first+1);
        }
         

        return maximum;
        
    }
    
}