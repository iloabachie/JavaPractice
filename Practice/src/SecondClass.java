public class SecondClass {
    public static void main(String[] args) {
        double myDouble = 20, mysecDouble = 87;
        System.out.println(myDouble + mysecDouble);
        double myCombo = (myDouble + mysecDouble) * 100;
        double remainder = myCombo % 40;
        System.out.println(remainder);              

        boolean myBoole = (remainder == 0) ? true : false;  //ternary operator, short cut for if else.

        if (!myBoole) {
            System.out.println("Got some remainder");
        }

    }
    
}
