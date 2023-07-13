public class StantonMeasure {

    public static int stantonMeasure(int []  a){
        int result = 0;
        int count = 0;
        for (int i: a){
            if(i == 1){
                count++;
            }
        }
        for (int i: a){
            if(i == count){
                result++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
       int [] arr = {1,2,1,3,3,3,3,3,3,4};
       int[] arr1 = {0};
        System.out.println(stantonMeasure(arr));
        System.out.println(stantonMeasure(arr1));

    }
}
