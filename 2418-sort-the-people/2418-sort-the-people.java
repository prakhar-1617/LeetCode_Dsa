class Solution {
      //doing it by using comparator
     class Person{
        String name;
        int height;

        Person(String name,int height){
           this.name=name;
           this.height=height;
        }
     }
      

    public String[] sortPeople(String[] names, int[] heights) {

        Person[] arr = new Person[names.length];
      for(int i=0;i<names.length;i++){
        arr[i]=new Person(names[i],heights[i]);
      }

     Arrays.sort(arr, (a, b) -> b.height - a.height);

     String[] ans=new String[names.length];
     for(int i=0;i<arr.length;i++){
        ans[i]=arr[i].name;
     }
     return ans;
    }
}