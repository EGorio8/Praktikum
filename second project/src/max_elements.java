import java.util.Scanner;
public class max_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int max = 0;
        int maxcount = 0;

        while (input != 0) {
            if (input > max) {
                maxcount = 1;
                max = input;
            } else {
                if (input == max) {
                    maxcount += 1;
                }
            }
            input = sc.nextInt();
        }
        System.out.println("Ответ: "+maxcount);
    }
}