class Solution {
    public String reverseString(String s) {
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        for(int i = 0; i<j; ++i,--j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        String reverse = new String(arr);
        return reverse;
    }
}