package quickstart;

/**
 * Created by evangu on 16/3/1.
 */
import java.util.*;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("输入数值1");
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        /*if (score>90) {
            System.out.println("Hello,World");
        }
        else {
            System.out.println("shit11");
        }*/
        switch (score){
            case 1:
                System.out.println("你出的是石头");
                break;
            case 2:
                System.out.println("你出的是剪刀");
                break;
            case 3:
                System.out.println("你出的是布");
                break;
            default:
                System.out.println("请输入正确的数值");
                break;
        }
    }
}
