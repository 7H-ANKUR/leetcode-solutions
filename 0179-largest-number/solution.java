

class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder s= new StringBuilder();
        String [] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.toString(nums[i]);

        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));

        if(arr[0].equals("0")){
                return "0";

        }    
        

        for(int j=0;j<arr.length;j++){
                s.append(arr[j]);
            }
         
        return s.toString();
        
        

       

    }

        
    
}