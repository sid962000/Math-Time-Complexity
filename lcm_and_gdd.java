class Solution {
    public static int[] lcmAndGcd(int a, int b) {
      int[] ans = new int[2];
      int orig1 = a;
      int orig2 = b;
      while(a%b!=0){
          int rem = a%b;
          a=b;
          b=rem;
      }
        int gcd = b;
        ans[1]=gcd;
        int lcm = (orig1*orig2)/gcd;
        ans[0]=lcm;
        return ans;
    }
}