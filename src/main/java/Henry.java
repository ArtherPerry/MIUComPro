public class Henry {
    public static int henry(int i, int j){
     if(i == 0 || j == 0){
         return 0;
     }
    int [] result = getPerfectNumber(i > j ? i:j);


        return result[i-1] + result[j-1];
    }

    public static int[] getPerfectNumber(int num){
        int [] result = new int [num];
        for (int i = 0; i < num; i++){
            int prefectNum = result[i ==0? 0: i-1];
            int start = prefectNum +1;
            while (sumFactor(start) != start){
                start++;
            }
            result[i] = start;
        }

        return result;
    }
    public static int sumFactor(int n){
        int sum = 0;
        for (int i = 1;i < n; i++){
           if(n%i == 0){
               sum += i;
           }
        }
        return sum;
    }


    public static void main(String[] args) {

        System.out.println(henry(1,3));
        System.out.println(henry(2,4));
    }
}
