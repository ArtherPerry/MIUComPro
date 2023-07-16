public class IsSquare {
    public static int isSquare(int n){
        int i =1;
    while (i *i <= n){
        if(i *i == n){
            return 1;
        }
        i++;
    }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(isSquare(8));
        System.out.println(isSquare(4));
        System.out.println(isSquare(9));
    }
}
