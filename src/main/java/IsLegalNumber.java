public class IsLegalNumber {
    public static int isLegalNumber(int [] a, int n){
        for (int i : a){
            if(i >= n){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int [] arr = {3,7,1};
        int n = 6;
        System.out.println(isLegalNumber(arr,n));
    }
}
