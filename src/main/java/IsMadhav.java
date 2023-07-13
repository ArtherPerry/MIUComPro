public class IsMadhav {
    public static int isMadhavArray(int[] a) {
        int n = 2;
        boolean isCorrectLength = false;
        while (n*(n+1) <= 2 * a.length) {
            if (n*(n+1) == 2 * a.length) {
                isCorrectLength = true;
                break;
            }
            else {
                n++;
            }
        }
        if (!isCorrectLength) return 0;

        int num = 2;
        for(int i = 1; i < a.length; ){
            int sum = 0;
            for (int j = i; j < i+num; j++) {
                sum = sum + a[j];
            }
            if (sum != a[0]) {
                return 0;
            }
            i = i + num;
            num++;
        }
        return 1;
    }




    public static void main(String[] args) {
        int [] arr = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int [] arr1 = {18, 9, 10, 6, 6, 6};
        System.out.println(isMadhavArray(arr));
        System.out.println(isMadhavArray(arr1));
    }



}
