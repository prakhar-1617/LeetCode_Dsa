class Solution {
    public boolean lemonadeChange(int[] bills) {
        //by greedy 
        //we dont need change of 20 as we are not giving anyone 20 as a channge
        int changeof5 =0;
        int changeof10=0;
        for(int x:bills){
            if(x==5){
                changeof5++;
            }
            else if(x==10){
                if(changeof5>=1){
                changeof10++;
                changeof5--;
            }
            else{
                return false;
            }
            }
            else{
                if(changeof5>=1 && changeof10>=1){
                    changeof5--;
                    changeof10--;
                }
                else if(changeof5>=3){
                    changeof5-=3;
                }
                else{
                    return false;
                }

            }
        }
        return true;
    }
}