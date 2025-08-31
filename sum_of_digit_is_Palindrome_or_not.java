// User function Template for Java

class Solution {
    int digitSum(int n){
        int sum=0;
        int temp=n;
        while(temp>0){
            int digit = temp%10;
            sum+=digit;
            temp=temp/10;
        }
        return sum;
    }
    boolean isPalindrome(int s){
        String p = String.valueOf(s);
        int i=0;
        int j=p.length()-1;
        while(i<j){
            if(p.charAt(i)!=p.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    boolean isDigitSumPalindrome(int n) {
       int sum = digitSum(n);
       return isPalindrome(sum);
    }
}