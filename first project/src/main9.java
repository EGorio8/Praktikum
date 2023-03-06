import java.util.Scanner;
public class main9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        String output;
        for (int i = 0; i < x+1; i++) {
            output = main9.print_line(i);
            System.out.println(output);
        }
    }
    public static String print_line(int length) {
        String str = "";
        for (int i = 0; i < length; i++) {
            str += "*";
        }
        return str;
    }
}