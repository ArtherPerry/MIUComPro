public class RepsEqual {

    public static int repsEqual(int [] a, int n){
    int index = 0;
    int result = 0;
    while (a[index] == 0){
        index++;
    }
    for (; index<a.length; index++){
        result = (int)(result+a[index] * Math.pow(10,a.length-1-index));
    }
    if(result == n){
        return 1;
    }
    return 0;
    }

    public static void main(String[] args) {
        int [] arr = {0,3,2,0,5,3};
        int [] arr1 = {9,3,1,1,2};
        int n = 32053;

        System.out.println(repsEqual(arr,n));
    }
}
