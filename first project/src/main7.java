import java.util.Scanner;
public class main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double n = sc.nextDouble();
        double x = sc.nextDouble();
        double Summa = x;
        while (Summa< n){
            Summa +=x;
        }
        System.out.println(Summa);
    }
}