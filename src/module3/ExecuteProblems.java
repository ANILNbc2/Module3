package module3;

import java.util.Arrays;
import java.util.Random;

public abstract class ExecuteProblems {
    public Integer[] intArray = new Integer[Constants.arraySize];
    public String str;
    public Random random = new Random();

    public void createInputString(){
        char[] characters = new char[Constants.arraySize];
        for(int i=0;i<Constants.arraySize;i++){
            characters[i] = (char) (random.nextInt(26)+ 'a');
        }
        this.str = new String(characters);
    }

    public void displayString(){
        System.out.println("The input String : "+ str);
    }


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

    public void updateInputArray(Integer[] intArray){
        this.intArray = new Integer[intArray.length];
        for(int i=0;i<intArray.length;i++){
            this.intArray[i] = intArray[i];
        }
    }

    public void updateInputString(String str){
        this.str = str;
    }

    public void display(){
        for(int i=0;i<intArray.length;i++){
            System.out.print(intArray[i] + "    ");
        }
        System.out.println();
    }

    public void display(Integer[] intArray){
        for(int i=0;i<intArray.length;i++){
            System.out.print(intArray[i] + "    ");
        }
        System.out.println();
    }

    public abstract void execute();

}
