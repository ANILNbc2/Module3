package module3.Day25StringPatternMatching;

import module3.Constants;
import module3.ExecuteProblems;

public class Day25ExecuteProblems extends ExecuteProblems implements InputForProblem {
    public void execute() {
        Integer subStrLen = random.nextInt(5);
        while(subStrLen == 0){
            subStrLen = random.nextInt(5);
        }
        if(Constants.RANDOM_INPUT) {
            createInputString();
        }else {
            updateInputString(createNewInputString());
        }
        displayString();
        Problem1.solution(str);
    }

    public String createNewInputString(){
        String str = getInputString();
        char[] characters = str.toCharArray();
        //Add space to string.
        for(int i=0;i<5;i++){
            characters[random.nextInt(str.length())] = ' ';
        }
        return new String(characters);
    }
}
