class Solution {
    public double average(int[] salary) {
        int min=salary[0];
        int max=salary[0];
        for(int i=0;i<salary.length;i++){
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
        }
        double sum=0;
        double count=0;

        for(int x:salary){
            if(x!=min && x!=max){
                sum+=x;
                count++;
            }
        }
        return sum/count;
    }
}