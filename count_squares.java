// User function Template for Java

class Solution {
    static int countSquares(int n) {
        if(n==0 || n<0){
            return 0;
        }
      
        int count=0;
        for(int i=1;i<n;i++){
        double sqrt =  Math.sqrt(i);
        if((int)sqrt * sqrt == i){
            count++;
        }
    }
        return count;
        
        //return (int) (Math.sqrt(n-1));
  }
}