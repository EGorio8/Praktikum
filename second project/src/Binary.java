import java.util.Scanner;
public class Binary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String b = "";
        while (N > 0) {
            if (N % 2 == 0) {
                b += "0";
            } else {
                b += "1";
            }
            N /= 2;
        }
        System.out.println(b);
    }
}