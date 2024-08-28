package module3.Day22TwoPointers_1;

public class Problem2 {
    public static void solution(Integer[] intArray, Integer num){
        int left = 0;
        int right = 1;

        while(left < intArray.length && right < intArray.length &&
                intArray[right] - intArray[left] != num){
            if(intArray[right] - intArray[left] > num){
                left++;
                continue;
            }
            right++;
        }

        if(left < intArray.length && right < intArray.length &&
        intArray[right] - intArray[left] == num){
            System.out.println(String.format("The combination exists :\n" +
                            "indexes left : " +
                            "%d and right : %d with values %d and %d have a " +
                            "difference " +
                            "equal to number : %d",left, right, intArray[left],
                    intArray[right], num));
            return;
        }

        System.out.println(String.format("The combination for sum equal to " +
                "number : %d does not exist",num));
    }
}
