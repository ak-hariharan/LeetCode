### The solution for the given problem is done in Java 
class Solution {
    public int[] buildArray(int[] nums) {
        
        int len = nums.length;
        int[] arr = new int[len];
        for(int i = 0; i < nums.length; i += 1)
            arr[i] = nums[i];
        for(int i = 0; i < nums.length; i += 1)
            nums[i] = arr[arr[i]];
        return nums;
    }
}
