package module3.Day26String2;

public class Problem1ZAlgo {
    public static void solution(char[] str){
        int l=0;
        int r=0;
        int[] zValue = new int[str.length];
        for(int i=0;i<str.length;i++){
            if(i>r){
                l=i;
                r=i;
                while(r<str.length && str[r]==str[r-l]){
                    r++;
                    zValue[i] = r-l; r--;
                }
            }else{
                if(i+zValue[i-l] <=r){
                    zValue[i] = zValue[i-l];
                }else{
                    l=i;
                    while(r<str.length && str[r]==str[r-l]){
                        r++;
                        zValue[i] = r-l; r--;
                    }
                }
            }
        }

    }
}
