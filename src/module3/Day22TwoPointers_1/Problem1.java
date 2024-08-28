package module3.Day22TwoPointers_1;

public class Problem1 {
    public static void solution(Integer[] intArray, Integer num){
        //Two pointer solution :
        int left = 0;
        int right = intArray.length-1;
        while(left < right){
            if(intArray[left] + intArray[right] == num){
                System.out.println(String.format("The combination exists :\n" +
                                "indexes " +
                                "left : " +
                                "%d and right : %d with values %d and %d have a sum " +
                                "equal to number : %d",left, right, intArray[left],
                        intArray[right], num));
                return;
            }
            if(intArray[left] + intArray[right] < num){
                left++;
                continue;
            }
            right--;
        }
        System.out.println(String.format("The combination for sum equal to " +
                "number : %d does not exist",num));
    }
}
