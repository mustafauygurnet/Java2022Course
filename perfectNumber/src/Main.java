public class Main {
    public static void main(String[] args) throws Exception {
        int number = 6;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println(number  + " is perfect number");
        }else{
            System.out.println(number  + " is not perfect number");
        }

    }
}
