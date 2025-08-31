// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
       //int[] ans = new int[11];
       ArrayList<Integer> l = new ArrayList<>();
       for(int i=1;i<=10;i++){
           l.add(n*i);
       }
       return l;
    }
}