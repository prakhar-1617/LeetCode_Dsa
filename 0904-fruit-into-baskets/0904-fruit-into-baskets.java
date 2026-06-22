class Solution {
    public int totalFruit(int[] fruits) {
   //  question saying to //Find the longest contiguous subarray containing at most 2 distinct elements.
    HashMap<Integer,Integer> map=new HashMap<>();
    int max=0;
      int left=0;
      int len=0;
      for(int right=0;right<fruits.length;right++){
        //expanding hashmap
        map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

        //if invalid shrink the hashmao
        while(map.size()>2){
            map.put(fruits[left],map.get(fruits[left])-1);
            if(map.get(fruits[left])==0){   //agr kisi ka count 0 ho gya to usko htana bhi pdega na hah table se
                map.remove(fruits[left]);
            }
            left++;
        }

        if(map.size()<=2){   //truecondition ke liye
            len=right-left+1;
            max=Math.max(max,len);
        }


      } 
      return max;
    }
}