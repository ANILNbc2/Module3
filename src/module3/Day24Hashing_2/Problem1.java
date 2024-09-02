package module3.Day24Hashing_2;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void solution(String str, Integer subStrLen){
        Map<Character, Integer> hashMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
        }

        for(Character ch:hashMap.keySet()){
            if(hashMap.get(ch)%subStrLen > 0){
                System.out.println(String.format("String %s cannot be broken to " +
                        "smaller strings of length %d", str, subStrLen));
                return;
            }
        }
        System.out.println(String.format("String %s can be broken to " +
                "smaller strings of length %d", str, subStrLen));
    }
}
