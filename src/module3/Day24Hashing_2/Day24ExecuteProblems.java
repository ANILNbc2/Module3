package module3.Day24Hashing_2;

import module3.Constants;
import module3.ExecuteProblems;

public class Day24ExecuteProblems extends ExecuteProblems implements InputForProblem {
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
        Problem1.solution(str, subStrLen);
    }

    public String createNewInputString(){
        String str = "Hello World";
        return str;
    }
}
