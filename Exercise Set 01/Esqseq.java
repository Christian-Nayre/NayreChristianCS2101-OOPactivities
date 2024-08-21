public class Esqseq {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 5; i++) {
            int multiple =i * 7;

            if (count % 2 == 0) {
                System.out.println(multiple);
            }
            else {
                System.out.println("\t" + multiple);
            }

            count++;
        }
    }
}
