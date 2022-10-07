public class Main {
    public static void main(String[] args) throws Exception {

        int number1 = 220;
        int number2 = 284;

        int temp1 = 0;
        int temp2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                temp1 += i;
            }
        }

        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                temp2 += i;
            }
        }

        if (temp1 == number1 && temp2 == number2) {
            System.out.println(number1 + " and " + number2 + " is friendly number");
        } else {
            System.out.println(number1 + " and " + number2 + " is not friendly number");
        }

    }
}
