package module3.Day22TwoPointers_1;

import module3.Constants;
import module3.ExecuteProblems;

import java.net.Inet4Address;

public class Day22ExecuteProblems extends ExecuteProblems implements InputForProblem3{

    @Override
    public void execute() {
        Integer numToFind = 0;
        if(Constants.RANDOM_INPUT) {
            createInput();
            numToFind =
                    random.nextInt((int) Math.abs(Constants.inputUpperLimit * 3));
        }else {
            numToFind =createInputInteger();
            updateInputArray(createInputArray());
        }

        System.out.println("Input array : ");
        display();
        Problem4.solution(intArray);
    }

    public Integer[] createInputArray(){
        Integer[] intArray = {1,3,15,10, 20,23,3};
        return intArray;
    }

    public Integer createInputInteger(){
        return 45;
    }
}
