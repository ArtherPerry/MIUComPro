public class SequentiallyBounded {
    public static int isSequentiallyBounded(int [] a){
        if(a.length < 1){
            return 1;
        }
        for (int i = 0; i<a.length-1;i++){
            if(a[i] > a[i+1]){
                return 0;
            }
        }
        for (int i = 0; i<a.length;i++){
            int count = 0;
            for (int j = i; j<a.length;j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count > a[i]){
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int [] arr = {5,5,5,2,5};
        int [] arr1 = {2, 3, 3, 99, 99, 99, 99, 99};
        int [] arr2 = {5,5,5,5};
        System.out.println(isSequentiallyBounded(arr));
        System.out.println(isSequentiallyBounded(arr1));
        System.out.println(isSequentiallyBounded(arr2));
    }
}
