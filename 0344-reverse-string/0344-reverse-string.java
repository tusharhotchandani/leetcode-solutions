class Solution {
    public void reverseString(char[] s) {
        int st=0;
        int e=s.length -1;
        char temp = 0;
        while(st<=e){
            temp = s[st];
            s[st] = s[e];
            s[e] = temp;

            st++;
            e--;
        }
    }
}