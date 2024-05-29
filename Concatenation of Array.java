class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i += 1){
            ans[i] = nums[i];
        }
        for(int j = n, i =0; j < 2*n; j += 1){
            ans[j] = nums[i];
            i += 1;
        }
        return ans;
    }
}
