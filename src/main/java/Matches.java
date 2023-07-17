public class Matches {
    public static int matches(int []a ,int [] p){
       int count = 0;
       for (int i : p){
           count += i> 0 ? i:0-i;
       }
       if(a.length != count){
           return 0;
       }
       int index = 0;
       for (int i: p){
           int start = index;
           for (;start<(index+i > 0? i: 0-i); start++){
               if(i > 0 && a[start]<0 || i<0 && a[start] >0){
                   return 0;
               }
           }
           index += start;
       }
       return 1;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3, -5, -5, 2, 3, 18};
        int [] p = {3, -2, 3};
        System.out.println(matches(a,p));

    }
}
