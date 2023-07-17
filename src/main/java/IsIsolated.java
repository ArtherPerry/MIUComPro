public class IsIsolated {
    public static int isIsolated(long n){
        if(n < 1 || n >2097151){
            return -1;
        }
        long square = n *n;
        long cube = n* square;
        while (square > 0){
            long digit = square%10;
            square = square/10;
            long tempCube = cube;
            while (tempCube > 0){
                long cubeDigit = tempCube%10;
                tempCube = tempCube/10;
                if(digit == cubeDigit){
                    return 0;
                }
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(isIsolated(163));
        System.out.println(isIsolated(162));
        System.out.println(isIsolated(-1));
        System.out.println(isIsolated(2097152));
    }
}
