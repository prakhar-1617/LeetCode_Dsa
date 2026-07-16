class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase();
        String[] arr=text.split(" ");
         Arrays.sort(arr, (a, b) -> a.length() - b.length());
        // HashMap<String,Integer> map=new HashMap<>();
        // for(String s:arr){
        //     int len=s.length();
        //     map.put(s,len);
        // }
        // for(String keys:map.keySet()){
        //     if(map.get(keys)<min){

        //     }
      //  }
      StringBuilder st=new StringBuilder();
      for(int i=0;i<arr.length;i++){
        st.append(arr[i] +" ");
      }
   st.setCharAt(0,Character.toUpperCase(st.charAt(0)));
      return st.toString().trim();
    }
}