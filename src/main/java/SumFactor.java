public class SumFactor {
    public static int sumFactor(int [] a){
       int result = 0;
       int sum = 0;
       for (int i = 0; i<a.length; i++){
           sum += a[i];
       }
       for (int j = 0; j< a.length; j++){
           if(a[j] == sum){
               result++;
           }
       }
       return result;
    }


    public static void main(String[] args) {
        int [] array = {3,0,2,-5,0};
        int [] array1 = {9,-3,-3,-1,-1};
        int [] array2 = {1};
        System.out.println(sumFactor(array));
        System.out.println(sumFactor(array1));
        System.out.println(sumFactor(array2));
    }
}
