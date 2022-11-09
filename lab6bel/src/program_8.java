import java.util.Scanner;
public class program_8 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        double answer;
        System.out.println("Vvedite chislo");
        double a = myscan.nextDouble();
        while (true) {
            System.out.println("Vvedite operaciu");
            String xd = myscan.nextLine();
            String b = myscan.nextLine();
            System.out.println("Vvedite chislo");
            double c = myscan.nextDouble();
            if (b.equals("+")) {
                answer = a += c;
                System.out.println("Rezultat " + (answer) + "\n");
            }
            if (b.equals("-")) {
                answer = a -= c;
                System.out.println("Rezultat " + (answer) + "\n");
            }
            if (b.equals("*")) {
                answer = a *= c;
                System.out.println("Rezultat " + (answer) + "\n");
            }
            if (b.equals("/")) {
                answer = a /= c;
                System.out.println("Rezultat " + (answer) + "\n");
            }
        }
    }
}