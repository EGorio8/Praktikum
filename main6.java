import java.util.Scanner;
public class main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a = sc.nextDouble();
        double Summa = 0;
        while (a != 0){
            Summa +=a;
            a = sc.nextDouble();
        }
        double s = Summa;
        System.out.println(s);
    }
}
