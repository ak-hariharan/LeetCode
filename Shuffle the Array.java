class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr = new int[nums.length];
        int k = 0;
        int h = 1;
        for(int i = 0; i < nums.length / 2; i += 1){
            arr[k] = nums[i];
            arr[h] = nums[n];
            k += 2;
            h += 2;
            n += 1;
        }
        return arr;
    }
}
