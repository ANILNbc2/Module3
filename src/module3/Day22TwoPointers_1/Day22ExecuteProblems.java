package module3.Day22TwoPointers_1;

import module3.Constants;
import module3.ExecuteProblems;

import java.net.Inet4Address;

public class Day22ExecuteProblems extends ExecuteProblems {

    @Override
    public void execute() {
        distictSortedInput();
        Integer numToFind =
                random.nextInt((int) Math.abs(Constants.inputUpperLimit*0.5));
        System.out.println("Input array : ");
        display();
        Problem2.solution(intArray, numToFind);
    }
}
