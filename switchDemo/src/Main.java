public class Main {
    public static void main(String[] args) throws Exception {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Perfect");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Not Bad");
                break;
            case 'D':
                System.out.println("Bad");
                break;
                default:
                System.out.println("Invalid Number" + grade);
        }

    }
}
