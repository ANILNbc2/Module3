package Day21TwoPointer;

public class Problem1 {
    public static void execute(Integer[] intArray, Integer numToFind){
        int minIndex = findSmallestElement(intArray);
        System.out.println(minIndex + " continuing");

        System.out.println("Num to find : " + numToFind);


        if(numToFind > intArray[intArray.length-1]){
            binarySearch(numToFind, intArray, 0, minIndex-1);
        }else
            binarySearch(numToFind, intArray, minIndex, intArray.length-1);

    }

    private static void binarySearch(int numToFind, Integer[] intArray, int left, int right) {
        if ((right == -1) || (numToFind > intArray[right] || numToFind < intArray[left])){
            System.out.println("Not found : " + numToFind);
            return;
        }
        int count = 0;
        int mid = (right - left)/2 + left;
        while(left < right && count < 10){
            mid = (right - left)/2 + left;
            System.out.println(String.format("left = %d right = %d mid = %d", left, right, mid));
            count ++;
            if(numToFind == intArray[left] || numToFind == intArray[right] || numToFind == intArray[mid]) {
                System.out.println("Num found : " + numToFind);
                break;
            }
            if (numToFind > intArray[mid]){
                left = mid+1;
                continue;
            }
            right = mid-1;
        }
        System.out.println("Num not found : " + numToFind);
        return;
    }

    private static Integer findSmallestElement(Integer[] nums){
        int left = 0;
        int right = nums.length -1;
        int mid = (right - left)/2 + left;
        int count = 0;
        boolean found = false;

        if(nums[nums.length-1] < nums[nums.length-2])
            return nums.length -1;

        if(nums[0]> nums[1]){
            return 1;
        }

        while (!found && count < 10){
            count++;
            mid = (right - left)/2 + left;
            System.out.println(String.format("left = %d right = %d mid = %d", left, right, mid));
            if((mid == 0 && nums[mid] < nums[mid+1]) || (mid == nums.length-1 && nums[mid] < nums[mid-1]))
                return mid;

            if(mid >0 && mid < nums.length -1 &&  nums[mid -1]>nums[mid] && nums[mid+1]>nums[mid]){
                found = true;
                break;
            }
            if (nums[mid] > nums[left] && nums[mid]>nums[right]){
                left = mid;
                continue;
            }
            right = mid;
            continue;

        }

        return mid;
    }
}
