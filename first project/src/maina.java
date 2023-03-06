import java.util.Scanner;
public class maina {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a = sc.nextDouble();
        int count = 0;
        double Summa = 0;
        while (a != 0){
            count+=1;
            Summa +=a;
            a = sc.nextDouble();
        }
        double s = Summa/count;
        System.out.println(s);
    }
}
