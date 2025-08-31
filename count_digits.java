// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int cnt =0;
         if(n==0){
            return cnt;
        }
        int temp=n;
        while(n>0){
            int digit = n%10;
            if(digit!=0 && temp%digit==0){
                cnt++;
            }
            n=n/10;
        }
        return cnt;
    }
}