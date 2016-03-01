package quickstart;

/**
 * Created by evangu on 16/3/1.
 */
import java.util.*;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("输入你的分数");
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        if (score>90) {
            System.out.println("Hello,World");
        }
        else {
            System.out.println("shit11");
        }
    }
}
