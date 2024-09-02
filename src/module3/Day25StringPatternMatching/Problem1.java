package module3.Day25StringPatternMatching;

import java.util.Arrays;

//Word by Word, not character by character
public class Problem1 {
    public static void solution(String str){
        char[] characters = str.toCharArray();
        char charAtIndex;

        /*for(int i=0;i<str.length()/2; i++){
            charAtIndex = characters[i];
            characters[i] = characters[str.length() -i -1];
            characters[str.length() -i -1] = charAtIndex;
        }*/

        int start = 0;
        int curIndex = start;

        while(curIndex<characters.length){
            while(curIndex<characters.length && characters[curIndex] != ' '){
                curIndex++;
            }

            for(int j=0; j< (curIndex-start-1)/2;j++){
                charAtIndex = characters[j+start];
                characters[j+start] = characters[curIndex -j -1];
                characters[curIndex-j-1] = charAtIndex;
            }
            curIndex++;
            //characters[curIndex]=' ';
            start = curIndex;
        }

        for(int j=0; j<(curIndex-start)/2; j++){
            charAtIndex = characters[j +start];
            characters[start +j] = characters[curIndex -j -1];
            characters[curIndex -j -1] = charAtIndex;
        }

        String finalStr = new String(characters);
        System.out.println(finalStr);
    }
}
