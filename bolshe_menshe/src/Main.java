import java.util.Scanner;
public class Main {

    static int Random() {
        int m = (int) (Math.random() * 100 + 1);
        return(m);
    }
    static Scanner sc = new Scanner(System.in);

    public static void gaga() {
        int r = Random();
        System.out.print("Guess a number between 1 and 100: ");
        int n = sc.nextInt();
        int c = 1;

        while (r!=n){
            c+=1;
            if (n>r){
                System.out.println(n+" is too high. Try again.");
            }
            if (n<r){
                System.out.println(n+" is too low. Try again.");
            }
            System.out.print("Guess a number between 1 and 100: ");
            n = sc.nextInt();
        }
        System.out.println(n+" is correct! You win!");
        System.out.println("It only took you "+c+" tries! Good work!");
    }

    public static void main(String[] args) {
        String option = "y";
        while (!option.equals("n")) {
            gaga();
            System.out.println("Would you like to play again? (y/n)");
            option = sc.next();
        }
    }
}