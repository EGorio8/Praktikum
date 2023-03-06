import java.util.Scanner;

public class main10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        String out = "*";
        String space = "";
        for (var i = 1; i <= n; i++) {
            for (var j = n; j > i; j--) {
                space += " ";
            }
            System.out.println(space + out);
            out += "**";
            space = "";
        }
    }
}
