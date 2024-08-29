package module3.Day22TwoPointers_1;

public class Problem3 {
    public static void solution(Integer[] intArray, Integer num){
        int sum = 0;
        int left=0;
        int right=0;

        while(left< intArray.length && right < intArray.length && sum != num){
            if(sum < num){
                right++;
                if(right == intArray.length)
                    break;
                sum+=intArray[right];
                continue;
            }
            left++;
            if (left == intArray.length)
                break;
            sum-=intArray[left];
        }

        if(left<intArray.length && right<intArray.length && sum == num){
            System.out.println(String.format("The combination exists :\n" +
                            "indexes from left : " +
                            "%d and right : %d have a submatrix with sum " +
                            "equal to number : %d",(left+1), right, num));
            return;
        }

        System.out.println(String.format("The combination for sum equal to " +
                "number : %d does not exist",num));
    }
}
