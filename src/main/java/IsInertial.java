import java.util.*;

public class IsInertial {
  public static  int isInertial(int [] a){
      List<Integer> odd = new ArrayList<>();
      List<Integer> even = new ArrayList<>();
      for (int i :a){
          if( i%2 == 0){
              even.add(i);
          }else {
              odd.add(i);
          }
      }
      if(even.size() ==0 && odd.size() == 0){
          return 0;
      }
      Collections.sort(odd);
      if(even.size() == 1){
          if(even.get(0) > odd.get(odd.size()-1)){
              return 1;
          }
          else {
              return 0;
          }
      }
      HashSet<Integer> set= new HashSet<>();
      set.addAll(even);
     List<Integer> even1= new ArrayList<>();
     for (int e:set){
         even1.add(e);
     }
     Collections.sort(even1);
     if(even1.get(even1.size()-1) < odd.get(odd.size()-1)){
         return 0;
     }
     if(even1.get(even1.size()-2)< odd.get(0)){
         return 1;
     }


      return 0;
  }

    public static void main(String[] args) {
      int [] a = {2,12,12,4,6,8,11};
      int [] a1 = {1,2,3,4};
        System.out.println(isInertial(a1));
    }

}
