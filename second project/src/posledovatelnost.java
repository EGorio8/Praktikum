import java.util.Scanner;

public class posledovatelnost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Counter = 0;
        int negCounter = 0;

        int n = sc.nextInt();
        while (n != 0) {
            if (n % 3 == 0) {
                Counter += 1;
            }
            if (n < 0) {
                negCounter += 1;
            }
            n = sc.nextInt();
        }
        if (Counter > negCounter) {
            System.out.println("333");
        } else {
            if (negCounter > Counter) {
                System.out.println("negative");
            } else {
                System.out.println("Equal");
            }
        }
    }
}