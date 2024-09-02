package module3.Day25StringPatternMatching;

public class Problem2 {
    public void solution(String str){
        char[] evenArray = new char[str.length()];
        char[] oddArray = new char[str.length()];
        int evenIndex = 0;
        int oddIndex = 0;

        for(int i=0;i<str.length(); i++){
            if((str.charAt(i) - 'a')%2 ==0){
                evenArray[evenIndex++] = str.charAt(i);
            }else {
                oddArray[oddIndex++] = str.charAt(i);
            }
        }
        if(evenIndex > 0 && oddIndex > 0 &&
                ((evenArray[evenIndex-1]+1 != oddArray[0] && evenArray[evenIndex-1] - 1 != oddArray[0]) ||
                (oddArray[oddIndex-1]+1 != evenArray[0] && oddArray[oddIndex -1] -1 != evenArray[0]))){
            System.out.println("True");
        }else
            System.out.println("False");
    }
}
