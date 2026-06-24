class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr=new ArrayList<>();
        char[] sortP=p.toCharArray();
        Arrays.sort(sortP);
        //using fixed sliding window
        int left=0;
        int right=p.length();

        while (right<=s.length()){
           String st= s.substring(left,right);
           char[] sort=st.toCharArray();
           Arrays.sort(sort);

            if(Arrays.equals(sortP,sort)){
                arr.add(left);
            }
            left++;
            right++;
            }
        return arr;
    }
}