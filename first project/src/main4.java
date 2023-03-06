import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a = sc.nextDouble();
        double s = 0;
        double summa = 0;
        while (a!=0){
            s = a%10;
            a = (a/10) - (s/10);
            summa += s;
        }
        System.out.println(summa);
    }
}