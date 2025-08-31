// User function Template for Java
class Solution {

    String reverseEqn(String s) {
     /*String ans ="";
     Stack<Character> st = new Stack<>();
     int i=s.length()-1;
     while(i>=0){
         if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' 
         || s.charAt(i)=='/'){
             while(!st.isEmpty()){
                 ans+=st.pop();
             }
             ans+=s.charAt(i);
         }
         else{
             st.push(s.charAt(i));
         }
         i--;
     }
     while(!st.isEmpty()){
         ans += st.pop();
     }
     return ans;
    }*/
    StringBuilder sb = new StringBuilder();
    String temp = "";
    for(int i=s.length()-1;i>=0;i--){
        Character ch = s.charAt(i);
        if(Character.isDigit(ch)){
            temp = ch + temp;
        }else{
            sb.append(temp);
            sb.append(ch);
            temp = "";
        }
    }
    sb.append(temp);
    return sb.toString();
    
    }
    
}