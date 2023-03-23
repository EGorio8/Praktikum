import java.util.Scanner;

public class prosto_soedini_ix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("введите количество строк");
        int n = sc.nextInt();
        n=n+1;
        String [] mas = new String[n];
        System.out.println("введите строки");
        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextLine();
        }
        System.out.println("введите разделитель");

        String divider = sc.nextLine();

        String s = "";
        for (int i = 0; i < n; i++) {
            s = s.concat(mas[i]);
            if (i != n - 1) {
                s = s.concat(divider);
            }
        }

        System.out.println(s);
    }
}