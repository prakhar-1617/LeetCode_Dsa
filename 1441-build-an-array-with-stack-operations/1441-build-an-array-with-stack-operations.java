class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> arr=new ArrayList<>();
        int targetpointer=0;
        int npointer=1;
        while(targetpointer<target.length && npointer<=n){
            if(target[targetpointer]==npointer){
                arr.add("Push");
                targetpointer++;
                npointer++;
            }
            else{
                arr.add("Push");
                arr.add("Pop");
                npointer++;
            }

        }
          return arr;
    }
}