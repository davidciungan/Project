package lab3.calculator;

public class Calculator {

    public static void main(String[] args) {
Calculator ob=new Calculator();
double x=sum(12,13);
        System.out.println(x);
int d=dif(12,2);
        System.out.println(d);
int m= mul(12,3);
        System.out.println(m);
 int i=div(12,3);
        System.out.println(i);



    }
        public static   double sum ( double first, double second){
            double sum = first + second;
            return sum;
        }

        public static int dif ( int first, int second){
            int dif = first - second;
            return dif;
        }

        public static int mul ( int first, int second){
            int mul = first * second;
            return mul;
        }

        public static int div ( int first, int second){
            int div = first / second;
            return div;
        }

    }
