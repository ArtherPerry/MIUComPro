import java.util.HashSet;
import java.util.Set;

public class Vanilla {
    public static int isVanilla(int [] a) {
        if(a.length < 0){
            return 1;
        }
        Set<Integer> set = new HashSet<>();
        for (int i =0; i< a.length; i++){
           if(a[i] < 0){
               a[i] = -a[i];
           }
           while (a[i] >0){
               int digit = a[i]%10;
               a[i] = a[i]/10;
               set.add(digit);
           }

        }
        if(set.size() > 1){
            return 0;
        }
        return 1;
    }



    public static void main(String[] args) {
        int [] arr = {11, 22, 13, 34, 125};
        int [] arr1 = {9, 999, 99999, -9999};
        int [] arr2 = {1};
        int [] arr3 = {};
        int[] arr4 = {1, 1, 11, 1111, 1111111};
        int[] arr5 = {11, 101, 1111, 11111};
        System.out.println(isVanilla(arr));
        System.out.println(isVanilla(arr1));
        System.out.println(isVanilla(arr2));
        System.out.println(isVanilla(arr3));
        System.out.println(isVanilla(arr4));
        System.out.println(isVanilla(arr5));

    }
}
