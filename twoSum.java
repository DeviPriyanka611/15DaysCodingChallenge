class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    System.out.print(i+j);
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String args[]){
    Solution obj=new Solution();
    obj.twoSum(new int[]{2,7,11,15},9);
}
}

 