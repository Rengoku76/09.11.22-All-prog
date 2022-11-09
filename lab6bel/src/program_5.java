public class program_5 {
    public static void main(String[] args) {
        int count = 0;
        int count2 = 1;
        while (count<20){
            count+=4;
            count2 *= count;
            System.out.println(count2);
        }
    }
}