class Solution {
    public String reorderSpaces(String text) {
        String[] arr = text.trim().split("\\s+");
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        if (len == 1) {
            StringBuilder sb = new StringBuilder(arr[0]);
            while (count-- > 0) {
                sb.append(" ");
            }
            return sb.toString();
        }
        int space = count / (len - 1);
        int remaining = count % (len - 1); 

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            res.append(arr[i]);
            if (i != arr.length - 1) {
                for (int j = 0; j < space; j++) {
                    res.append(" ");
                }
            }
        }
        while (remaining-- > 0) {
            res.append(" ");
        }

        return res.toString();
    }
}