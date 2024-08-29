package module3.Day23Hashing_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem1 {
    public static void solution(Integer[] intArray){
        Map<Integer, Integer> hashMap= new HashMap<>();
        Integer currentMin = Integer.MAX_VALUE;
        Set<Integer> minPair = new HashSet<>();
        for(int i=0;i<intArray.length; i++){
            if(hashMap.containsKey(intArray[i])) {
                if ((i - hashMap.get(intArray[i])) < currentMin) {
                    currentMin = i - hashMap.get(intArray[i]);
                    minPair.clear();
                    minPair.add(hashMap.get(intArray[i]));
                    minPair.add(i);
                }
            }
            hashMap.put(intArray[i], i);
        }

        if(!minPair.isEmpty()) {
            System.out.println(String.format("The min pair are : %d and %d " +
                            "for value %d ", minPair.toArray()[0],
                    minPair.toArray()[1], intArray[(int)minPair.toArray()[0]]));
        }else {
            System.out.println("There are no duplicates in the Array");
        }
    }
}
