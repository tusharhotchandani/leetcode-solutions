class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> roman = new HashMap<>();
        roman.put('I' , 1);
        roman.put('V' , 5);
        roman.put('X' , 10);
        roman.put('L' , 50);
        roman.put('C' , 100);
        roman.put('D' , 500);
        roman.put('M' , 1000);

        int ans=0;
        char[] arr = s.toCharArray();

        for(int i =0 ; i<arr.length -1 ; i++){
            if( (roman.get(arr[i])) < roman.get(arr[i+1]) ){
                ans = ans - roman.get(arr[i]);
            }
            else{
                ans = ans + roman.get(arr[i]);
            }
        }
        ans = ans + roman.get(arr[arr.length-1]);
        return ans;
    }    
}