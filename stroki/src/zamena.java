import java.util.Scanner;

class zamena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String s = sc.nextLine();
        String value = s.replace(a, b);
        System.out.println(value);
    }
}