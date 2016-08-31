package quickstart;

/**
 * Created by evangu on 16/8/31.
 */
public class count {
    public static void main(String[] args){
        int beernum= 99;
        String word="bottles";
        while (beernum>0){
            if (beernum==1){
                word="bottle";
            }
            System.out.println(beernum+word);
            beernum=beernum-1;
        }
    }
}
