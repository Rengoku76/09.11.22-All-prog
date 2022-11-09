public class program_7 {
    public static void main(String[] args) {
        int a = 5;
        int a_count = 1;
        System.out.println("a1="+a);
        while (a_count<100) {
            a = a*3 + 1;
            a_count +=1;
            System.out.println("a"+a_count+"="+a);
            if (a>2000000000000000000l){
                System.out.println("Dofiga poluchilos");
            }
        }
    }
}
