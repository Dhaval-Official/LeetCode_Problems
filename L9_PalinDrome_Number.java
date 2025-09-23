class Solution {
    public boolean isPalindrome(int x) {
        
        String temp = Integer.toString(x);
        int mid = (temp.length()/2);
        int L = 0,R = temp.length()-1;

        for(int i=0;i<=mid;i++) {
            if(temp.charAt(L) != temp.charAt(R)) {
                return false;
            }
            L++;
            R--;
        }

        return true;
    }
}
