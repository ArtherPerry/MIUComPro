import java.util.HashSet;
import java.util.Set;

public class Trivalent {
    public static int isTrivalent(int [] a){
        if(a.length < 1){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i<a.length; i++){
            set.add(a[i]);
        }
        if(set.size() != 3){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int [] arr = {-1, 0, 1, 0, 0, 0};
        int [] arr1 = {};
        int [] arr2 = { 2147483647, -1, -1, -2147483648};
        int [] arr3= {22, 19, 10, 10, 19, 22, 22, 10};
        int [] arr4 =  {1, 2, 2, 2, 2, 2, 2};
        int [] arr5= {2, 2, 3, 3, 3, 3, 2, 41, 65};
        System.out.println(isTrivalent(arr));
        System.out.println(isTrivalent(arr1));
        System.out.println(isTrivalent(arr2));
        System.out.println(isTrivalent(arr3));
        System.out.println(isTrivalent(arr4));
        System.out.println(isTrivalent(arr5));
    }
}
