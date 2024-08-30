package module3.Day23Hashing_1;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public static void solution(Integer[] intArray){
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<intArray.length; i++){
            int count = 0;
            if(hashMap.containsKey(intArray[i])){
                count = hashMap.get(intArray[i]);
            }
            count++;
            hashMap.put(intArray[i], count);
        }

        int numPairs = 0;
        for(Integer key: hashMap.keySet()){
            int curCount = hashMap.get(key);
            numPairs += curCount*(curCount-1)/2;
        }
        System.out.println("Num pairs : " + numPairs);
    }
}
