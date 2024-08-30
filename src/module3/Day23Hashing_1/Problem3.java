package module3.Day23Hashing_1;

import java.util.HashSet;
import java.util.Set;

public class Problem3 {
    public static void solution(Integer[] intArray){
        Set<Integer> intSet = new HashSet();
        for(int i=0;i<intArray.length;i++){
            intSet.add(intArray[i]);
        }
        int longestChain = -1;
        int curChain = 0;
        int curVal = -1;
        for(Integer val:intSet){
            if(intSet.contains(val-1)){
                continue;
            }
            curVal = val;
            curChain=0;
            while(intSet.contains(curVal++)){
                curChain++;
            }
             longestChain = longestChain>curChain?longestChain:curChain;
        }
        System.out.println("Longest chain : "+ longestChain);
    }
}
