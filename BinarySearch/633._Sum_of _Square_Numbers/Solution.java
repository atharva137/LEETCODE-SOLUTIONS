import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean judgeSquareSum(int c) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i <=Math.sqrt(c); i++){
            set.add(i*i);
            if(set.contains(c-(i*i))){
                return true;
            }
        }
        return false;
    }
}