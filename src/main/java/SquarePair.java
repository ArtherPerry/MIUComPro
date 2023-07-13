import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquarePair {
    public static  int countSquarePair(int [] a){
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (int e : a){
            list.add(e);
        }
        Collections.sort(list);
        for (int i = 0; i <list.size()-1; i++){
            if(list.get(i) <1){
                continue;
            }

            for (int j = i+1; j <list.size(); j++){
                double sqrt = Math.sqrt(list.get(i) + list.get(j));
               if(sqrt *10 % 10 == 0){
                   result ++;
               }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int []  a = {9,0,2,-5,7};
        int [] a1 = {9};
        System.out.println(countSquarePair(a));
        System.out.println(countSquarePair(a1));
    }
}
