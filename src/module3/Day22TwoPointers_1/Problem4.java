package module3.Day22TwoPointers_1;

public class Problem4 {
    public static void solution(Integer[] intArray) {
        int left = 0;
        int right = intArray.length-1;
        int maxWater = -1;
        int maxWaterLeft = -1;
        int maxWaterRight = -1;
        int curWater = -1;

        curWater = (right-left)*Math.min(intArray[left], intArray[right]);
        maxWater = curWater;
        maxWaterLeft = left;
        maxWaterRight = right;

        while (left<right){
            curWater = (right-left)*Math.min(intArray[left], intArray[right]);
            //maxWater = curWater>maxWater?curWater:maxWater;
            if(maxWater < curWater){
                maxWaterLeft = left;
                maxWaterRight = right;
                maxWater = curWater;
            }

            if(intArray[left]>intArray[right]){
                right--;
            }else {
                left++;
            }
        }
        System.out.println(String.format("Max water that can be held = : %d, with " +
                "left : %d and right = %d : ", maxWater, maxWaterLeft,
                maxWaterRight));
    }
}
