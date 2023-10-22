import javax.management.PersistentMBean;

public class keywords {

    public static int calculate(boolean gameOver, int score, String me) {
        // String me = "hello" + "how are you" + "when";
        System.out.println("this methid is running" + gameOver + score);

        if (gameOver) {
            // System.out.println("testing this");
        }

        if (score == 50) {
            System.out.println("completed the if" + 111);
        } else if (gameOver) {
            System.out.println("the else if" + me + 222);
        } else {
            System.out.println("the else" + 333);
        }
        return 67;
    }
    
    
    public static void main(String[] args) {
        String me = "hello" + "how are you" + "when";

        var gameOver = true;
        int score = 50;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println(calculate(true, 50, "hello"));

        calculate(true, score, "hello");

        calculate(false, 45, "hello");

        int number = 3;
        String msg =  (number % 2 == 0) ? "The number is even!" : "The number is odd!";
        System.out.println(msg);

        System.out.println((number % 2 == 0) ? "The number is even!" : "The number is odd!");


    }

    
    
}
