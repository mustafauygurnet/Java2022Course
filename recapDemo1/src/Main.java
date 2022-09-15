public class Main {
    public static void main(String[] args) throws Exception {
        
        int number1 = 20;
        int number2 = 25;
        int number3 = 2;

        int temp = number1;

        if (temp <= number2) {
            temp = number2;
        }
        
        
        if (number1 <= number3) {
            temp = number3;
        }

        System.out.println(temp);

    }
}
