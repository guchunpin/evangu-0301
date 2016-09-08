package quickstart;

/**
 * Created by evangu on 16/9/8 at 15:30.
 */
public class player {
    int number=0;
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("I am guessing " + number);
    }
}
