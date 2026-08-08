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

        for(int i=0; i<arr.length; i++){
            if(i<arr.length-1){
                if( (arr[i] == 'I' && (arr[i+1] == 'V' || arr[i+1] =='X')) ||
                    (arr[i] == 'X' && (arr[i+1] == 'L' || arr[i+1] =='C')) ||
                    (arr[i] == 'C' && (arr[i+1] == 'D' || arr[i+1] =='M'))   ){
                        ans = ans + (roman.get(arr[i+1]) - roman.get(arr[i]) );
                        i = i+1;
                }
                else{
                    ans = ans + roman.get(arr[i]);
                }
            }
            else if(i>=1){
                if( (arr[i-1] == 'I' && (arr[i] == 'V' || arr[i] =='X')) ||
                    (arr[i-1] == 'X' && (arr[i] == 'L' || arr[i] =='C')) ||
                    (arr[i-1] == 'C' && (arr[i] == 'D' || arr[i] =='M'))   ){
                        ans = ans + (roman.get(arr[i]) - roman.get(arr[i-1]) );
                        i = i+1;
                }
                else{
                    ans = ans + roman.get(arr[i]);
                }
            }
            else{
                ans = ans + roman.get(arr[i]);
            }
        }

        return ans;
    }
}