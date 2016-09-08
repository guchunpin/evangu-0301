package quickstart;

/**
 * Created by evangu on 16/9/8 at 15:17.
 */


public class GuessGame {

    public void startgame(){
        player p1=new player();
        player p2=new player();
        player p3=new player();

        int guessp1= 0;
        int guessp2= 0;
        int guessp3= 0;

        boolean p1isRight=false;
        boolean p2isRight=false;
        boolean p3isRight=false;

        int targetnumber=(int)(Math.random() * 10);
        System.out.println("I am thinking of a number between 0 and 9...");

        while (true){
            System.out.println("Number to guess is " + targetnumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1=p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2=p2.number;
            System.out.println("Player one guessed " + guessp2);

            guessp3=p3.number;
            System.out.println("Player one guessed " + guessp3);
            if (guessp1==targetnumber){p1isRight=true;
            }

            if (guessp2==targetnumber){p2isRight=true;
            }

            if (guessp3==targetnumber){p3isRight=true;
            }

            if (p1isRight||p2isRight||p3isRight){
                System.out.println("We have a winner!");
                break;
            }
            else{
                System.out.println("Players will have to try again.");
            }
        }
    }
}
