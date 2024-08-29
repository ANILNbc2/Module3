package module3.Day23Hashing_1;

import module3.Constants;
import module3.Day22TwoPointers_1.Problem4;
import module3.ExecuteProblems;

public class Day23ExecuteProblems extends ExecuteProblems implements InputForProblem{
    public void execute() {
        if(Constants.RANDOM_INPUT) {
            createInput();
        }else {
            updateInputArray(createInputArray());
        }
        System.out.println("Input array : ");
        display();
        Problem1.solution(intArray);
    }

    public Integer[] createInputArray(){
        Integer[] intArray = {1,3,15,10,20,23,3};
        return intArray;
    }

    @Override
    public Integer createInputInteger() {
        return 0;
    }
}
