package quickstart;

/**
 * Created by evangu on 16/9/4 at 00:23.
 */
public class PhraseoMatic {
    public static void main (String[] args ){
        String[] wordListOne={
                "24/7","multitier","30,000 foot","B-TO-B","win-win","front-end","web-based","pervasive","smart",
                "six-sigma","critical-path","dynamic"
        };
        String[] wordListTwo={
                "empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside",
                "position","network","foucs","shared","accelerated"
        };
        String[] wordListThree={
                "process","tipping-point","solution","architecture","core competency","strategy","mindshare"
        };
        int onelength = wordListOne.length;
        int twolength = wordListTwo.length;
        int threelength = wordListThree.length;

        int rand1 = (int) (Math.random() * onelength);
        int rand2 = (int) (Math.random() * twolength);
        int rand3 = (int) (Math.random() * threelength);

        String phrase = wordListOne[rand1] +" "+ wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}
