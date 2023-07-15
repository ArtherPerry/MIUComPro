public class NUnique {

    public static int isNUnique(int [] a, int n){
    if(a.length < 2){
        return 0;
    }
    int count = 0;
    for (int i =0; i<a.length-1;i++){
        if(a[i] > n){
            continue;
        }
        for (int j = i+1;j < a.length;j++ ){
            if (a[i] + a[j] == n){
                count++;
            }
        }
    }
        if(count == 1){
            return 1;
        }
    return 0;
    }

    public static void main(String[] args) {
        int [] arr = {7, 3, 3, 2, 4};
        int a = 6;
        int a1 = 10;
        int a2 = 11;
        System.out.println(isNUnique(arr,a));
        System.out.println(isNUnique(arr,a1));
        System.out.println(isNUnique(arr,a2));
    }
}
