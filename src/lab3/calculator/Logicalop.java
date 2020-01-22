package lab3.calculator;

public class Logicalop {


//    public void ex4(int num) {
//        if (num >= 2 && num <= 8) {
//            System.out.println(num);
//        }
//
//    }

    public int checkBiggerNumber(int first, int second) {

        if (first > second) {
            return first;
        } else {
            return second;

        }
    }
//EXERCITIUL 4

    public String verify(String text) {
        String first = "FastTrackIT";

        if (text.equals(first)) {
            return ("Learning text comparison");
        } else {

            return ("Got to try some more");


        }


    }
// EXERCITIUL 5   ------>>>>>>>>>> Sebi, te rog sa -mi zici specific daca e ok exercitiul asta, mersi! //////


    public String check(String text, int num) {
        String f = "FasttrackIT";
        String value = text + num;
        String off = num + text;
        if (text.equals(f) && num <= 3) {

            return value;
        } else if (!text.equals(f) && num >= 4) ;

        return off;

    }


//    EXERCITIUL 7

    public String num(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        }
        if (number < 3) {

            return "The number is lower than 3";


        }
        return "0";
    }
//    EXERCITIUL 6

    public String amount(int numar) {
        if (numar > 8 || numar == 6) {
            return "The amount of snow this winter was(cm):" + numar;
        } else {
            return "The forecast snow is(cm):" + numar;
        }
    }


//    EXERCITIUL 8

    public String switcher(int num) {
        switch (num) {
            case 100:
                break;

            case 200:
                break;

            case 250:
                break;


        }
        return "the number is " + num;

    }


//EXCERCITIUL 9

    public boolean isNumberEven(int num) {
        if (num % 2 == 0) return true;
        else return false;
    }


    //     EXERCITIUL 10


    public boolean isEligibleToVote(int age) {

        if (age > 18) return true;
        else return false;
    }

//    EXERCITIUL 11

    public int greater(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        }
        if (c > b && c > a) {
            return c;
        }
        return 0;
    }
}
























