public class Main {
    public static void main(String[] args) {
        int number = sum(15, 7);
        int totalNumber = sum(15, 7, 6, 7, 7, 8, 89, 9, 9, 6, 4, 32);
        System.out.println(totalNumber);
    }

    public static void add() {
        String message = "Hello world";
        String newMessage = message.substring(0, 2);
        System.out.println(newMessage);

    }

    public static void update() {
        System.out.println("updated");
    }

    public static void delete() {
        System.out.println("deleted");
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int... numbers) {
        int count = 0;
        for (int number : numbers) {
            count += number;
        }
        return count;
    }

    public static String getCity() {
        return "Mersin";
    }
}
