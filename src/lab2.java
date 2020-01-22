import org.w3c.dom.ls.LSOutput;

public class lab2 {
    public static void main(String[] args) {

        // JAVA PATTERN 1

        System.out.println("   J     a   v     v    a");
        System.out.println("   J    a a   v   v    a a");
        System.out.println("J  J   aaaaa   v v    aaaaa ");
        System.out.println(" JJ   a     a   v    a     a");


// PATERN 2 ( CU GHILIMELE NU MA LASA SA-I FAC FREAZ)

        System.out.println("  + ' ' ' ' ' +");
        System.out.println("[ |   o   o   |");
        System.out.println("  |     ^     | ");
        System.out.println("  |    '_'    | ");
        System.out.println("  + _ _ _ _ _ +");

        System.out.println("Tema"); // TEMA METODE, EXERCITIUL 2

        int x = sum(50, 100);
        System.out.println("rezultatul adunarii este:" + x);

        int y = dif(50, 100);

        System.out.println("rezultatul scaderii este:" + y);

        float z = div(8.5f, 3.2f);
        System.out.println("rezultatul impartirii este:" + z);

        double q = mul(3d, 18d);
        System.out.println("rezultatul inmultirii este:" + q);

        int rest = div(1267, 9);
        System.out.println("Restul impartirii este:" + rest);


        float mmedie = mda(10,20,30);


          System.out.println("Media aritmetica este:" + mmedie);

//EXERCITIUL 7

     float C=tmpc(120);

        System.out.println("Temperatura in grade celsius este:" + C);

//Exercitiul 8

        float CM= 1234.56f*2.54f;
       float M=CM/100;
        System.out.println("Distanta din inch in Metri este:" + M);

        //Exercitiul 9













    }


    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;

    }


    public static int dif(int first, int second) {
        int dif = second - first;
        return dif;


    }

    public static float div(float first, float second) {
        float div = first / second;
        return div;
    }

    public static float mul(double first, double second) {
        double mul = first * second;
        return (float) mul;


    }
// EXERCITIUL 6

    public static int div(int dividend, int divisor) {

        int div = dividend / divisor;
        int remainder = dividend % divisor;
        return remainder;
    }

    // EXERCITIUL 4 // asta nu stiu sa-l fac

     public static float mda(float a1,float a2, float a3) {

         float mda = (a1 + a2 + a3) / 3;
         return mda;


     }

//EXERCITIUL 7 -> nu inteleg care- i faza...nu mi da eroare,,,da nu -mi da nici rezultatu



  public static float tmpc(float c){

     float tmpc = (c-32)* 5 /9;
     return tmpc;
         }

//return gradeC;


// EXERCITIUL 8

    public static float div(){

        float disinch= 1234.56f;
        float convCM = 1234.56f*2.54f;
        float convM= convCM/100;
        return convM;


    }

// Exercitiul 9

    public static float div1(){

        float dism= 1234;

        float sec = 1;
        float tim=1*sec;
        float metrii=1;



        float min= 60*sec;
        float hour= 60* min;

float km= 1000*metrii;
float mile= metrii*1609;

float speed2 =km/hour;
float speed3=mile/hour;
float spd=dism/tim;
return spd;


//

}





}




























