public class ConvertToBase10 {
    public static int convertToBase10(int [] a , int base){
      if(IsLegalNumber.isLegalNumber(a, base) == 0){
          return -1;
      }
      int result = 0;
      for (int i = 0;i<a.length; i++){
        result+= a[i]* Math.pow(base,a.length-1-i);
      }
      return result;
    }

    public static void main(String[] args) {
        int []a = {1,1,2};
        int [] a1 = {3,2,5};
        System.out.println(convertToBase10(a,3));
        System.out.println(convertToBase10(a1,8));
    }
}
