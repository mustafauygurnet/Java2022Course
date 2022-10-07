public class Main {
    public static void main(String[] args) {
        MathClass mathClass = new MathClass();

        int result1 = mathClass.sum(5,4);
        int result2 = mathClass.subtraction(5,4);
        int result3 = mathClass.multiplication(5,4);
        int result4 = mathClass.division(5,4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
