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

//float suma  = sum(10f,20f,30f);

        //     float medie= suma/3f;

        //   System.out.println("Media aritmetica este:" + medie);

//EXERCITIUL 7

     float C=  5/9*(65-32);

        System.out.println("Temperatura in grade celsius este:" + C);

//Exercitiul 8

        float CM= 1234.56f*2.54f;
       float M=CM/100;
        System.out.println("Distanta din inch in Metri este:" + M);

        //Exercitiul 9

      float S=div(dism,tim)











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

    // public static float mean(float sum/float numar){

    //     float numar =3f;
    //   float mean= sum/numar;
    //    return mean;


    //    public static float sum(float num1f,float num2f, float num3f){


//float sum = num1f+ num2f+num3f;
    //   return sum;


//EXERCITIUL 7 -> nu inteleg care- i faza...nu mi da eroare,,,da nu -mi da nici rezultatu



    public static float mul(){

        float gradeF = 65;
        float gradeC = 5/9*(gradeF-32);

return gradeC;

}
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
float speed=metrii/sec;
float speed2 =km/hour;
float speed3=mile/hour;
float spd=dism/tim;
return spd;




}





}




























