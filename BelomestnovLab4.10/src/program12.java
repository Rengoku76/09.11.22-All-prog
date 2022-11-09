import java.util.Scanner;
public class program12 {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);
        System.out.print("Vvedi pervoe chislo: ");
        int a = myscan.nextInt();
        System.out.print("Vvedi vtoroe chislo: ");
        int b = myscan.nextInt();
        System.out.println("Vvedi simvol +,-,*,/: ");
        String c = myscan.nextLine();
        int d;
        if (c == "+") {
            d = a + b;
            System.out.print(d);
        }
        else {
            d = a - b;
            System.out.print(d);
        }
    }
}