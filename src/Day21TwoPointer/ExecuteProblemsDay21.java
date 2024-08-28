package Day21TwoPointer;

import java.util.Random;

import static java.util.Arrays.sort;

public class ExecuteProblemsDay21 {
    Random random = new Random();
    Integer[] intArray = new Integer[100];

    private Integer[] rotate(Integer[] intArray){
        int rotationPoint = random.nextInt(100);
        Integer[] nums = new Integer[intArray.length];

        for(int i=0;i<nums.length;i++)
            nums[i] = intArray[i];

        for (int i=0;i<intArray.length;i++){
            intArray[(rotationPoint+i)%intArray.length] = nums[i] ;
        }
        return intArray;
    }


    public void execute(){
        for (int i=0;i<intArray.length;i++){
            intArray[i] = random.nextInt(500);
        }

        sort(intArray);
        for(int i=1;i<intArray.length;i++){
            if(intArray[i] <= intArray[i-1]){
                intArray[i] = intArray[i-1]+1;
            }
        }
        intArray = rotate(intArray);
        int numToFind = intArray[random.nextInt(10)];
        display(intArray);
        Problem1.execute(intArray, numToFind);
        Problem1.execute(intArray, 371);
    }

    public void display(Integer[] intArray){
        for(int i=0;i <intArray.length; i++){
            System.out.print(intArray[i] + "    ");
        }
        System.out.println();
    }
}
