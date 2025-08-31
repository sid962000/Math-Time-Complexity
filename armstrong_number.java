// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int temp = n;
        int sum =0;
        while(temp>0){
            int digit = temp%10;
            sum = sum + (int)(Math.pow(digit,3));
            temp=temp/10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}