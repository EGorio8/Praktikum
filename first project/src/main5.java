import java.util.Scanner;
public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double per = 0;
        int day = 1;
        while (x<y){
            day+=1;
            per = x/10;
            x+=per;
        }
        System.out.println(day);
    }
}