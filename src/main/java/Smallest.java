public class Smallest {
   public static int isSmallest(int n){
     int number = 1;
     while (true){
         boolean containTwo = true;
         for (int i =1; i<= n; i++){
             int multiple = number*i;
             if(!isContain2(multiple)){
                 containTwo = false;
                 break;
             }
         }
         if(containTwo){
             return number;
         }
         number++;
     }

   }

   public static boolean isContain2(int number){
       while (number > 0){
          if(number%10 == 2){
              return true;
          }
          number /=10;
   }
    return false;
    }

    public static void main(String[] args) {
        System.out.println(isSmallest(7));
    }

}
