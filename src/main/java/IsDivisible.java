public class IsDivisible {
    public static int isDivisible(int[]a , int divisor){
        int count = 0;
        for (int i =0; i< a.length; i++){

            if(a[i]%divisor != 0){
                count++;
            }
        }
        if(count == 0){
            return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        int [] arr = {3,3,6,36};
        int divisor = 3;
        System.out.println(isDivisible(arr,divisor));
        int []  arr1 = {6,12,24,36};
        int divisor1= 12;
        System.out.println(isDivisible(arr1,divisor1));
    }
}
