import java.util.Scanner;
public class program11 {
        public static void main(String[] args) {

                Scanner myscan = new Scanner (System.in);

                int x = myscan.nextInt ();

                if (x>100)
                        System.out.println ("x > 100");
                else if (x > 1000)
                        System.out.println ("x > 1000");
                else
                        System.out.println ("x <= 100");
        }
}
