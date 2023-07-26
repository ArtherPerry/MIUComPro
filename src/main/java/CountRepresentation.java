public class CountRepresentation {
    public static int countRepresentation(int numRupees){
        int count = 0;
        for (int rupee20 = 0; rupee20<= numRupees/20; rupee20++){
            for (int rupee10 = 0;rupee10<=(numRupees-rupee20*20)/10;rupee10++){
                for (int rupee5 = 0;rupee5<=(numRupees-rupee20*20-rupee10*10)/5;rupee5++){
                    for (int rupee2 = 0;rupee2<=(numRupees-rupee20*20-rupee10*10-rupee5*5)/2;rupee2++){
                        int rupee1 = (numRupees-rupee20*20-rupee10*10-rupee5*5-rupee2*2);
                        if (rupee20*20+rupee10*10+rupee5*5+rupee2*2+rupee1 == numRupees){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num  = 12;
        System.out.println(countRepresentation(num));
    }
}
