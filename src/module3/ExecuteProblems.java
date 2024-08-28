package module3;

import java.util.Arrays;
import java.util.Random;

public abstract class ExecuteProblems {
    public Integer[] intArray = new Integer[Constants.arraySize];
    public Random random = new Random();

    public void createInput(){
        for(int i=0;i<Constants.arraySize;i++){
            intArray[i] = random.nextInt(Constants.inputUpperLimit);
        }
    }

    public void createSortedInput(){
        createInput();
        Arrays.sort(intArray);
    }

    public void distictSortedInput(){
        createSortedInput();
        for(int i=1;i<Constants.arraySize;i++){
            if (intArray[i] <= intArray[i-1]){
                intArray[i] = intArray[i-1] + 1;
            }
        }
    }

    public void display(){
        for(int i=0;i<Constants.arraySize;i++){
            System.out.print(intArray[i] + "    ");
        }
        System.out.println();
    }

    public abstract void execute();

}
