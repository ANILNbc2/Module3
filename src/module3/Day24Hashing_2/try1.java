package module3.Day24Hashing_2;

import module3.Constants;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class try1 {
    public static void main(String[] args) {
        Random random = new Random();
        HashMap<Integer, List<Integer>> oddEven = new HashMap<Integer,
                List<Integer>>();
        Integer[] inputArr = new Integer[Constants.arraySize*10];

        for(int i=0;i< Constants.arraySize*10;i++){
            inputArr[i] = random.nextInt(100);
        }

        for(Integer i:inputArr){
            List<Integer> odd;
            List<Integer> even;
            if(i%2==0){
                even = oddEven.getOrDefault(0, new ArrayList<Integer>());
                even.add(i);
                oddEven.put(0, even);
            }else {
                odd = oddEven.getOrDefault(1, new ArrayList<Integer>());
                odd.add(i);
                oddEven.put(1,odd);
            }
        }

        for (Integer key:oddEven.keySet()){
            System.out.println("Key : " + key + " value : "+oddEven.get(key));
        }
    }
}
