import java.util.Scanner;
class program4 {
    public static void main(String args[]){
        System.out.print("Vvedite slovo: ");
        Scanner scan = new Scanner(System.in);
        String slovo1 = scan.nextLine();
        System.out.print("Vvedite slovo: ");
        String slovo2 = scan.nextLine();
        System.out.println (slovo1+ " " + slovo2);
    }
}