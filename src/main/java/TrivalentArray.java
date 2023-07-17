public class TrivalentArray {
    public static int isTrivalent(int[] a) {
        if (a == null || a.length == 0) {
            return 0; // Empty array is not trivalent
        }

        Integer firstValue = null;
        Integer secondValue = null;
        Integer thirdValue = null;

        for (Integer num : a) {
            if (num == null) {
                continue; // Skip null values and move to the next element
            }

            if (firstValue == null) {
                firstValue = num;
            } else if (secondValue == null && !num.equals(firstValue)) {
                secondValue = num;
            } else if (thirdValue == null && !num.equals(firstValue) && !num.equals(secondValue)) {
                thirdValue = num;
            } else if (!num.equals(firstValue) && !num.equals(secondValue) && !num.equals(thirdValue)) {
                return 0; // More than three different values found
            }
        }

        return thirdValue != null ? 1 : 0; // If thirdValue is not null, the array is trivalent
    }

    public static void main(String[] args) {
        int [] arr = {-1, 0, 1, 0, 0, 0};
        int [] arr1 = { };
        int [] arr2 = { 2147483647, -1, -1 ,-2147483648};
        System.out.println(isTrivalent(arr));
        System.out.println(isTrivalent(arr1));
        System.out.println(isTrivalent(arr2));
    }
}
