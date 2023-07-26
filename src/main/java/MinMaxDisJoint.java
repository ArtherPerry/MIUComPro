public class MinMaxDisJoint {
    public static int isMinMaxDisJoint(int[] a) {
        if(a == null || a.length<3){
            return 0;
        }
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    int minIndex = 0;
    int maxIndex = 0;
    for (int i = 0; i<a.length;i++){
        if(a[i] > min){
            min = a[i];
            minIndex = i;
        }
       else if(a[i] < max){
            max = a[i];
            maxIndex = i;
        }
    }
    if(min == max){
        return 0;
    }
    if(Math.abs(minIndex-maxIndex ) == 1){
        return 0;
    }
    int minCount = 0;
    int maxCount = 0;
    for (int i = 0; i<a.length;i++){
        if(a[i] == min){
            minCount++;
        } else if (a[i] == max) {
            maxCount++;
        }
    }
    if(minCount !=1 || maxCount!=1 ){
        return 0;
    }
    return 1;
    }

    public static void main(String[] args) {
        int [] arr = {5,4,1,3,2};
        int [] arr1 = {18, -1, 3, 4, 0};
        int [] arr2 = {0, 5, 18, 0, 9};
        System.out.println(isMinMaxDisJoint(arr));
        System.out.println(isMinMaxDisJoint(arr1));
        System.out.println(isMinMaxDisJoint(arr2));

    }
}
