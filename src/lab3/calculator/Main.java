package lab3.calculator;

public class Main {

    public static void main(String[] args) {

//        EXERCITIUL 3

    Logicalop op = new Logicalop();

        int biggest = op.checkBiggerNumber(2,3);
        System.out.println("The bigger number is" + biggest);

//        EXERCITIUL 4

        System.out.println(op.verify("ceva raondom"));

//       EXERCITIUL 5

        System.out.println(op.check("FasttrackIT",5));

//        EXERCITIUL 7

        System.out.println(op.num(6));

//        EXERCITIUL 6

        System.out.println(op.amount(1));


//        EXERCITIUL 8 ------------>>>>>>>> asta nu stiu daca i bine...altfel habar n am cum se face

        System.out.println(op.switcher(345));

//        EXERCITIUL 9 .

        System.out.println(op.isNumberEven(15));

//     EXERCITIUL 10

        System.out.println(op.isEligibleToVote(123));

//        EXERCITIUL 11

        System.out.println(op.greater(12,13,15));
    }


}
