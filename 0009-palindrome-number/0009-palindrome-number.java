class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int res = 0;
        while(x>0){
            int r = x%10;
            res = res*10+r;
            x/=10;
        }
        if(res==temp){
            return true;
        }else{
           return false;
        }
    }
}