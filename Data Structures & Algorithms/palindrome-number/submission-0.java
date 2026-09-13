class Solution {
    public boolean isPalindrome(int x) {
        //base case of single digit number and non negative
        if( x<0){
            return false;
        }

        String s = Integer.toString(x);

        int i = 0;
        int j = s.length()-1;

        while( i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
        
    }
}