// User function Template for Java

class Solution {
    
    static int largestPrimeFactor(int n) {
     int ans=0;
     for(int i=2;i<=n/2;i++){
         while(n%i==0){
             if(i>ans){
                 ans=i;
             }
             n=n/i;
         }
     }
     if(n>1){
         if(n>ans){
             ans=n;
         }
     }
     return ans;
   }
}