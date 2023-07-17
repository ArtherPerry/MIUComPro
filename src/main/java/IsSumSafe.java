public class IsSumSafe {
    public static int isSumSafe(int [] a){
        if(a.length <= 0){
            return 0;
        }
        int sum = 0;
        for (int i =0; i<a.length; i++){
            sum += a[i];
        }
        for (int i =0; i<a.length; i++){
            if(a[i] == sum){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int [] arr = {5,-5,0};
        int [] arr1 = {5,-2,1};
        System.out.println(isSumSafe(arr));
        System.out.println(isSumSafe(arr1));
    }
}
