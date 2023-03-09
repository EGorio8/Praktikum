import java.util.Scanner;
public class kub {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int counter = 0;
        int cubeNumber = 0;
        String s;
        for(s = sc.next(); !s.equals("СТОП"); s = sc.next()){
            if ((s != "ээээ") | (s != "потом")) {
                counter += 1;
                if (s == "Куб") {
                    cubeNumber = counter;
                }
            }
        }
        System.out.println(cubeNumber);
    }
}