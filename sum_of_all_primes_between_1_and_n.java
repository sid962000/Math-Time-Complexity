class Solution {
    public boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int prime_Sum(int n) {
      int sum=0;
      for(int i=2;i<=n;i++){
          if(isPrime(i)){
             sum+=i; 
          }
      }
      return sum;
    }
}