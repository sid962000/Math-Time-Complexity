class Solution {
    public String multiplyStrings(String s1, String s2) {
        boolean neg = false;
        if(s1.charAt(0)=='-'){
            neg=!neg;
            s1=s1.substring(1);
        }
        if(s2.charAt(0)=='-'){
            neg=!neg;
            s2=s2.substring(1);
        }
        s1=s1.replaceFirst("^0+","");
        s2=s2.replaceFirst("^0+","");
        if(s1.length()==0 || s2.length()==0){
            return "0";
        }
        int l1 = s1.length();
        int l2 = s2.length();
        int[] res = new int[l1+l2];
        int i=l2-1;
        int pf = 0;
        while(i>=0){
            int ival = s2.charAt(i)-'0';
            i--;
            int j = l1-1;
            int k = res.length-1-pf;
            int carry=0;
            while(j>=0 || carry!=0){
                int jval = j>=0?s1.charAt(j)-'0':0;
                j--;
                int prod = ival*jval + carry + res[k];
                res[k]=prod%10;
                carry=prod/10;
                k--;
            }
            pf++;
        }
        // management of leading zeros using general method
        String str ="";
        if(neg){
            str = str+"-";
        }
        boolean flag = false;
        for(int val : res){
            if(val==0 && flag==false){
                continue;
            }else{
                flag=true;
                str += val;
            }
        }
        return str;
    }
}