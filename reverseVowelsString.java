class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowList = new ArrayList<Character>();
        vowList.add('a');
        vowList.add('A');
        vowList.add('e');
        vowList.add('E');
        vowList.add('i');
        vowList.add('I');
        vowList.add('o');
        vowList.add('O');
        vowList.add('u');
        vowList.add('U');
        char[] arr = s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<j){
            if(!vowList.contains(arr[i])){
                ++i;
                continue;
            }
            if(!vowList.contains(arr[j])){
                --j;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;
            --j;
        }
        return new String(arr);
    }
}