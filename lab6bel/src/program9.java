import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        int b = 4;
        Scanner myscan = new Scanner(System.in);
        System.out.println("2+2?");
        System.out.print("otvet: ");
        int a = myscan.nextInt();
        if (a != b) {
            while (a != b) {
                System.out.println("2+2?");
                System.out.print("otvet: ");
                int ans = myscan.nextInt();
            }
        }
    }
}
