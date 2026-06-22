class Solution {
    public boolean backspaceCompare(String s, String t) {

        //using stringbuilder for more optimized version
        Stack<Character> st1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
            else{
                if(!st1.isEmpty()) {
                st1.pop();
                }
            }
        }
         StringBuilder strS=new StringBuilder();
        while(!st1.isEmpty()){
            strS.append(st1.pop());

        }


         Stack<Character> st2=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
            else{
                if(!st2.isEmpty()) {
                st2.pop();
            }
            }
        }
    StringBuilder strT=new StringBuilder();
        while(!st2.isEmpty()){
            strT.append(st2.pop());
        }

        if(strT.toString().equals(strS.toString())){
            return true;
        }
        return false;
    }
}
      