class Solution {
    public long smallestNumber(long num) {
        //if (num == 0) return 0;
        if (num > 0) {
            char[] arr = String.valueOf(num).toCharArray();
            Arrays.sort(arr);
            if (arr[0] == '0') {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] != '0') {
                        char temp = arr[0];
                        arr[0] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }

            return Long.parseLong(new String(arr));
        }

        else {
            char[] arr = String.valueOf(-num).toCharArray();
            Arrays.sort(arr);

            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            return -Long.parseLong(new String(arr));
        }
    }
}