import java.util.Scanner;
public class main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double n = sc.nextDouble();
        double c = sc.nextDouble();
        double prois = 1;
        int k = 0;
        while (prois < n){
            k+=1;
            prois = prois*c;
            c = sc.nextDouble();
        }
        System.out.println(k +" "+prois);
    }
}
