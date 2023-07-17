public class IsStacked {
    public static int isStacked(int n){
        int sum = 0;
        int i = 1;
        while (sum < n){
            sum += i++;
            if(sum == n){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isStacked(10));
        System.out.println(isStacked(7));
    }
}
