public class Reduce {
    public static void main(String[] args) {

        int step = 0;

        for (int i = 100; i >= 0; i--) {

            if (i % 2 == 0) {
                i = i / 2;
                step++;

            }
            else {
                step++;
            }
        }
        System.out.println(step);
    }
}