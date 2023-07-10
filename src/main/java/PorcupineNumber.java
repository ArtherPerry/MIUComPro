public class PorcupineNumber {

    public static int findPorcupineNumber(int a){
        while (true){
            if(isPrime(++a) && isEndWithNine(a)){
                int  j = a;
                while (true){
                    if(isPrime(++j) ){
                        if(isEndWithNine(j)){
                            return a;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }


    public static  boolean isPrime(int a){

        for (int i = 2; i*i < a; i++){
            if( a%i ==0){
                return false;
            }
        }

        return true;
    }

    public static boolean isEndWithNine(int a){

        if(a%10 == 9){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 139;
        int a1 = 0;
        int a2= 138;
        System.out.println(findPorcupineNumber(a));
        System.out.println(findPorcupineNumber(a1));
        System.out.println(findPorcupineNumber(a2));
    }

}
