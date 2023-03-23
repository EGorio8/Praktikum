import java.util.Scanner;

public class IP_adresa {

    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        boolean opred = true;
        String [] inputIp = sc.nextLine().split("\\.");


        for (byte i = 0; i < 4; i++) {

            short ipByte = Short.parseShort(inputIp[i]);

            if ((ipByte > 255) || (ipByte < 0)) {
                opred = false;
            }

        }
        System.out.println(opred ? "YES" : "NO");
    }
}