class Solution {
    public void reverseString(char[] s) {
        
        int size = s.length;
        int j = size/2;
        char temp;
        
        for(int i = 1; i <= j ; i++){
           
            temp = s[size-i]; 
            s[size-i] = s[i-1];
            s[i-1] = temp;
        }
    }
}
