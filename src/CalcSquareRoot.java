public class CalcSquareRoot {
    public static void main(String[] args) {
        double A,B,C;
        A = 4.0;
        B = 5.0;
        C = -6.0;
        double x1,x2,x3;

        double d = B * B - 4 * A * C;

        if(d<0){
            System.out.println("brak rozwizan");
        }
        if(d==0){
            x1 = -B/(2*A);
            System.out.println("1 rozwiazanie = " + x1);
        }
        if(d>0){
            x2 = -B -(Math.sqrt(d))/(2*A);
            x3 = -B +(Math.sqrt(d))/(2*A);
            System.out.println("2 rozwiazania: ");
            System.out.println(x2);
            System.out.println(x3);
        }
    }
}
