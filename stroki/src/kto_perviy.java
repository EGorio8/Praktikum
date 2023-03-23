import java.util.Scanner;

public class kto_perviy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a =sc.nextLine();
        int kek = str.indexOf(a);
        int kuk = str.lastIndexOf(a);
        System.out.println(kek+" "+kuk);
        }
    }
