public class Solve10 {
    public static int[] solve10(){
        int [] result = new int [2];
        int factorialX = 1;
        int factorialY = 1;
        int factorial10 = 1;
        int x = 1;
        int y = 1;
        boolean match = false;
        for(int i = 0; i< 10; i ++){
            factorial10 = factorial10* i;
        }
        for (x = 1; x<=10 && !match; x++){
            factorialX = factorialX* x;
            factorialY = 1;
            for (y= 1; y<=10 && !match; y++){
                factorialY = factorialX * y;
                if(factorialX + factorialY == factorial10){
                    match = true;
                    break;
                }
            }
        }
        if (match){
            result[0]= x;
            result[1] = y;
        }else {
            result[0] = 0;
            result[1] = 0;

        }

        return result;

    }

    public static void main(String[] args) {
        int [] output = solve10();
        for (int e: output){
            System.out.println(e);
        }
    }
}
