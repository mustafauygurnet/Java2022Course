public class Main {
    public static void main(String[] args) throws Exception {
        int number = 3;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(number +  " Is Prime ? " + isPrime);

    }
}
