class Solution {
 
    public static void print_divisors(int n) {
        if(n==1){
            System.out.print(1);
            return;
        }
        List<Integer> l = new ArrayList<>();
        for(int i=1;i*i<=n;i++){ // TC = O(SQRT(N))
            if(n%i==0){
                l.add(i);
                if(n/i!=i){
                    l.add(n/i);
                }
            }
        }
        Collections.sort(l); //it takes O(nlogn)
        for(int val : l){
            System.out.print(val + " ");
        }
    }
}
