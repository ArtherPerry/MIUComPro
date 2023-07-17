public class IsCentered15 {

    public static int isCentered15(int [] a){
        for (int i =0; i < a.length/2; i++){
            int sum = 0;
            for (int j = i;j<a.length-i;j++){
                sum += a[j];
            }
            if(sum == 15){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] arr =  {3,2,10,4,1,6,9};
        int[] arr1 = {9,15,6};
        System.out.println(isCentered15(arr));
        System.out.println(isCentered15(arr1));
    }
}
