class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k<0){
            throw new IllegalArgumentException("Illegal argument!");
        }
        if(k > nums.length){
            k = k % nums.length;
        }
        int a = nums.length - k;
        reverse(nums, 0, a-1);
        reverse(nums, a, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    public void reverse(int[] arr, int left, int right){
        
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
            ++left;
            --right;
        }
    }
}