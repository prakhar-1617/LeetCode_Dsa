class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      
        //doing it by binary search on answer
        int left=0;
        int right=arr.length-1;
       

       //agr length 1 hua to
       if (arr.length == 1) {
    return 0;
}
        while(left<=right){
            int mid=left+(right-left)/2;

            //agr peak element 0 aur len[arr] ke bich me h (excluding)
            if(mid>0 && mid<arr.length-1){
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    return mid;
                }
                else if(arr[mid-1]>arr[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
                }

                //agr mid index 0 pe aa gyi to uska left to h nhi isiliye bss right se check krenge
            else if(mid==0){
                if(arr[0]>arr[1]){
                    return 0;
                }
                else{
                    left=mid+1;
                }
            }

            //agr mid index last index pe gyi to bss usko uske mid-1 se check krenge
            else if(mid==arr.length-1){
                if(arr[mid]>arr[mid-1]){
                    return mid;
                }
                else{
                    right=mid-1;
                }
            }
            
        }
        return -1;
    
    }
}