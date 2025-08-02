class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(currentSum+nums[i]>nums[i])
              {
                currentSum=currentSum+nums[i];
              }
            else{
              currentSum=nums[i];
                }
        maxSum=Math.max(maxSum,currentSum);
        }
    return maxSum;
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
